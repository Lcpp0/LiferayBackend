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

package com.the.simpsons.sb.service;

import com.liferay.portal.kernel.exception.PortalException;

import com.the.simpsons.sb.model.Character;

import java.util.List;

/**
 * Provides the remote service utility for Character. This utility wraps
 * <code>com.the.simpsons.sb.service.impl.CharacterServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CharacterService
 * @generated
 */
public class CharacterServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.the.simpsons.sb.service.impl.CharacterServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Character createCharacter(
			String name, String description, String image, String genre,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().createCharacter(
			name, description, image, genre, serviceContext);
	}

	public static Character deleteCharacter(long characterId)
		throws PortalException {

		return getService().deleteCharacter(characterId);
	}

	public static List<Character> getAllCharacters() {
		return getService().getAllCharacters();
	}

	public static Character getCharacter(long characterId)
		throws PortalException {

		return getService().getCharacter(characterId);
	}

	public static List<Character> getCharactersByGenre(String genre) {
		return getService().getCharactersByGenre(genre);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Character updateCharacter(
			long characterId, String name, String description, String image,
			String genre,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateCharacter(
			characterId, name, description, image, genre, serviceContext);
	}

	public static CharacterService getService() {
		return _service;
	}

	private static volatile CharacterService _service;

}