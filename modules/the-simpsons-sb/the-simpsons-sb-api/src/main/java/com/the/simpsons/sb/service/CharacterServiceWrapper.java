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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CharacterService}.
 *
 * @author Brian Wing Shun Chan
 * @see CharacterService
 * @generated
 */
public class CharacterServiceWrapper
	implements CharacterService, ServiceWrapper<CharacterService> {

	public CharacterServiceWrapper(CharacterService characterService) {
		_characterService = characterService;
	}

	@Override
	public com.the.simpsons.sb.model.Character createCharacter(
			String name, String description, String image, String genre,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterService.createCharacter(
			name, description, image, genre, serviceContext);
	}

	@Override
	public com.the.simpsons.sb.model.Character deleteCharacter(long characterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterService.deleteCharacter(characterId);
	}

	@Override
	public java.util.List<com.the.simpsons.sb.model.Character>
		getAllCharacters() {

		return _characterService.getAllCharacters();
	}

	@Override
	public com.the.simpsons.sb.model.Character getCharacter(long characterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterService.getCharacter(characterId);
	}

	@Override
	public java.util.List<com.the.simpsons.sb.model.Character>
		getCharactersByGenre(String genre) {

		return _characterService.getCharactersByGenre(genre);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _characterService.getOSGiServiceIdentifier();
	}

	@Override
	public com.the.simpsons.sb.model.Character updateCharacter(
			long characterId, String name, String description, String image,
			String genre,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterService.updateCharacter(
			characterId, name, description, image, genre, serviceContext);
	}

	@Override
	public CharacterService getWrappedService() {
		return _characterService;
	}

	@Override
	public void setWrappedService(CharacterService characterService) {
		_characterService = characterService;
	}

	private CharacterService _characterService;

}