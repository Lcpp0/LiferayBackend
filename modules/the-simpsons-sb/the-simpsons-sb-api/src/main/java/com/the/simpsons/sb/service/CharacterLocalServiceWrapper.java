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
 * Provides a wrapper for {@link CharacterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CharacterLocalService
 * @generated
 */
public class CharacterLocalServiceWrapper
	implements CharacterLocalService, ServiceWrapper<CharacterLocalService> {

	public CharacterLocalServiceWrapper(
		CharacterLocalService characterLocalService) {

		_characterLocalService = characterLocalService;
	}

	/**
	 * Adds the character to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CharacterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param character the character
	 * @return the character that was added
	 */
	@Override
	public com.the.simpsons.sb.model.Character addCharacter(
		com.the.simpsons.sb.model.Character character) {

		return _characterLocalService.addCharacter(character);
	}

	/**
	 * Creates a new character with the primary key. Does not add the character to the database.
	 *
	 * @param characterId the primary key for the new character
	 * @return the new character
	 */
	@Override
	public com.the.simpsons.sb.model.Character createCharacter(
		long characterId) {

		return _characterLocalService.createCharacter(characterId);
	}

	@Override
	public com.the.simpsons.sb.model.Character createCharacter(
			String name, String description, String image, String genre,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.createCharacter(
			name, description, image, genre, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the character from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CharacterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param character the character
	 * @return the character that was removed
	 */
	@Override
	public com.the.simpsons.sb.model.Character deleteCharacter(
		com.the.simpsons.sb.model.Character character) {

		return _characterLocalService.deleteCharacter(character);
	}

	/**
	 * Deletes the character with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CharacterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param characterId the primary key of the character
	 * @return the character that was removed
	 * @throws PortalException if a character with the primary key could not be found
	 */
	@Override
	public com.the.simpsons.sb.model.Character deleteCharacter(long characterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.deleteCharacter(characterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _characterLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _characterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.the.simpsons.sb.model.impl.CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _characterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.the.simpsons.sb.model.impl.CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _characterLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _characterLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _characterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.the.simpsons.sb.model.Character fetchCharacter(
		long characterId) {

		return _characterLocalService.fetchCharacter(characterId);
	}

	/**
	 * Returns the character matching the UUID and group.
	 *
	 * @param uuid the character's UUID
	 * @param groupId the primary key of the group
	 * @return the matching character, or <code>null</code> if a matching character could not be found
	 */
	@Override
	public com.the.simpsons.sb.model.Character fetchCharacterByUuidAndGroupId(
		String uuid, long groupId) {

		return _characterLocalService.fetchCharacterByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _characterLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.the.simpsons.sb.model.Character>
		getAllCharacters() {

		return _characterLocalService.getAllCharacters();
	}

	/**
	 * Returns the character with the primary key.
	 *
	 * @param characterId the primary key of the character
	 * @return the character
	 * @throws PortalException if a character with the primary key could not be found
	 */
	@Override
	public com.the.simpsons.sb.model.Character getCharacter(long characterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.getCharacter(characterId);
	}

	/**
	 * Returns the character matching the UUID and group.
	 *
	 * @param uuid the character's UUID
	 * @param groupId the primary key of the group
	 * @return the matching character
	 * @throws PortalException if a matching character could not be found
	 */
	@Override
	public com.the.simpsons.sb.model.Character getCharacterByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.getCharacterByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the characters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.the.simpsons.sb.model.impl.CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @return the range of characters
	 */
	@Override
	public java.util.List<com.the.simpsons.sb.model.Character> getCharacters(
		int start, int end) {

		return _characterLocalService.getCharacters(start, end);
	}

	@Override
	public java.util.List<com.the.simpsons.sb.model.Character>
		getCharactersByGenre(String genre) {

		return _characterLocalService.getCharactersByGenre(genre);
	}

	/**
	 * Returns all the characters matching the UUID and company.
	 *
	 * @param uuid the UUID of the characters
	 * @param companyId the primary key of the company
	 * @return the matching characters, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.the.simpsons.sb.model.Character>
		getCharactersByUuidAndCompanyId(String uuid, long companyId) {

		return _characterLocalService.getCharactersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of characters matching the UUID and company.
	 *
	 * @param uuid the UUID of the characters
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching characters, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.the.simpsons.sb.model.Character>
		getCharactersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.the.simpsons.sb.model.Character> orderByComparator) {

		return _characterLocalService.getCharactersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of characters.
	 *
	 * @return the number of characters
	 */
	@Override
	public int getCharactersCount() {
		return _characterLocalService.getCharactersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _characterLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _characterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _characterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the character in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CharacterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param character the character
	 * @return the character that was updated
	 */
	@Override
	public com.the.simpsons.sb.model.Character updateCharacter(
		com.the.simpsons.sb.model.Character character) {

		return _characterLocalService.updateCharacter(character);
	}

	@Override
	public com.the.simpsons.sb.model.Character updateCharacter(
			long characterId, String name, String description, String image,
			String genre,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _characterLocalService.updateCharacter(
			characterId, name, description, image, genre, serviceContext);
	}

	@Override
	public CharacterLocalService getWrappedService() {
		return _characterLocalService;
	}

	@Override
	public void setWrappedService(CharacterLocalService characterLocalService) {
		_characterLocalService = characterLocalService;
	}

	private CharacterLocalService _characterLocalService;

}