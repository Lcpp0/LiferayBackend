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
import com.liferay.portal.kernel.service.ServiceContext;
import com.the.simpsons.sb.model.Character;
import com.the.simpsons.sb.service.CharacterLocalServiceUtil;
import com.the.simpsons.sb.service.base.CharacterServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=thesimpsonsapi",
		"json.web.service.context.path=Character"
	},
	service = AopService.class
)
public class CharacterServiceImpl extends CharacterServiceBaseImpl {

	public com.the.simpsons.sb.model.Character createCharacter(String name, String description, String image,
																  String genre, ServiceContext serviceContext) throws PortalException {
		return CharacterLocalServiceUtil.createCharacter(name, description, image, genre, serviceContext);
	}

	public com.the.simpsons.sb.model.Character updateCharacter(long characterId, String name, String description,
																  String image, String genre, ServiceContext serviceContext) throws PortalException  {
		return CharacterLocalServiceUtil.updateCharacter(characterId, name, description, image, genre, serviceContext);
	}

	public com.the.simpsons.sb.model.Character deleteCharacter(long characterId) throws PortalException {

		return CharacterLocalServiceUtil.deleteCharacter(characterId);
	}

	public com.the.simpsons.sb.model.Character getCharacter(long characterId) throws PortalException {

		return CharacterLocalServiceUtil.getCharacter(characterId);
	}

	public List<com.the.simpsons.sb.model.Character> getCharactersByGenre(String genre) {

		return CharacterLocalServiceUtil.getCharactersByGenre(genre);
	}

	public List<Character> getAllCharacters() {
		return CharacterLocalServiceUtil.getAllCharacters();
	}
}