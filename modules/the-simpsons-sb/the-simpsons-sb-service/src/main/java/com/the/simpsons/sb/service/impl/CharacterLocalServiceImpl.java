/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.the.simpsons.sb.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.the.simpsons.sb.model.Character;
import com.the.simpsons.sb.service.base.CharacterLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.the.simpsons.sb.model.Character",
	service = AopService.class
)
public class CharacterLocalServiceImpl extends CharacterLocalServiceBaseImpl {
	private final Log log = LogFactoryUtil.getLog(CharacterLocalServiceImpl.class);

	public com.the.simpsons.sb.model.Character createCharacter(String name, String description, String image,
																  String genre, ServiceContext serviceContext) throws PortalException {

		Long characterId = counterLocalService.increment();

		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		com.the.simpsons.sb.model.Character character = characterPersistence.create(characterId);
		character.setName(name);
		character.setDescription(description);
		character.setImage(image);
		character.setGenre(genre);

		character.setUserId(serviceContext.getUserId());
		character.setGroupId(serviceContext.getScopeGroupId());
		character.setUserName(user.getFullName());
		character.setCreateDate(new Date());

		log.info(serviceContext.getUserId());
		log.info(serviceContext.getScopeGroupId());
		log.info(user.getFullName());
		characterPersistence.update(character);

		return character;
	}

	public com.the.simpsons.sb.model.Character updateCharacter(long characterId, String name, String description,
																  String image, String genre, ServiceContext serviceContext) throws PortalException {

		com.the.simpsons.sb.model.Character character = characterPersistence.findByPrimaryKey(characterId);
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		character.setName(name);
		character.setDescription(description);
		character.setImage(image);
		character.setGenre(genre);

		character.setUserId(serviceContext.getUserId());
		character.setGroupId(serviceContext.getScopeGroupId());
		character.setUserName(user.getFullName());
		character.setModifiedDate(new Date());

		return characterPersistence.update(character);
	}

	public com.the.simpsons.sb.model.Character deleteCharacter(long characterId) throws PortalException {

		return characterPersistence.remove(characterId);
	}

	public com.the.simpsons.sb.model.Character getCharacter(long characterId) throws PortalException {

		return characterPersistence.findByPrimaryKey(characterId);
	}

	public List<Character> getCharactersByGenre(String genre) {

		return characterPersistence.findBygenre(genre);
	}

	public List<com.the.simpsons.sb.model.Character> getAllCharacters() {
		return characterPersistence.findAll();
	}
}