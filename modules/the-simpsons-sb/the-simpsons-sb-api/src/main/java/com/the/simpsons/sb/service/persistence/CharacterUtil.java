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

package com.the.simpsons.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.the.simpsons.sb.model.Character;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the character service. This utility wraps <code>com.the.simpsons.sb.service.persistence.impl.CharacterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CharacterPersistence
 * @generated
 */
public class CharacterUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Character character) {
		getPersistence().clearCache(character);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Character> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Character> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Character> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Character> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Character update(Character character) {
		return getPersistence().update(character);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Character update(
		Character character, ServiceContext serviceContext) {

		return getPersistence().update(character, serviceContext);
	}

	/**
	 * Returns all the characters where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching characters
	 */
	public static List<Character> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the characters where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @return the range of matching characters
	 */
	public static List<Character> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the characters where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the characters where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Character> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByUuid_First(
			String uuid, OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByUuid_First(
		String uuid, OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByUuid_Last(
			String uuid, OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByUuid_Last(
		String uuid, OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the characters before and after the current character in the ordered set where uuid = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public static Character[] findByUuid_PrevAndNext(
			long characterId, String uuid,
			OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUuid_PrevAndNext(
			characterId, uuid, orderByComparator);
	}

	/**
	 * Removes all the characters where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of characters where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching characters
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the character where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCharacterException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByUUID_G(String uuid, long groupId)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the character where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the character where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the character where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the character that was removed
	 */
	public static Character removeByUUID_G(String uuid, long groupId)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of characters where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching characters
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the characters where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching characters
	 */
	public static List<Character> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the characters where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @return the range of matching characters
	 */
	public static List<Character> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the characters where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the characters where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Character> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the characters before and after the current character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public static Character[] findByUuid_C_PrevAndNext(
			long characterId, String uuid, long companyId,
			OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByUuid_C_PrevAndNext(
			characterId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the characters where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of characters where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching characters
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the characters where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching characters
	 */
	public static List<Character> findByname(String name) {
		return getPersistence().findByname(name);
	}

	/**
	 * Returns a range of all the characters where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @return the range of matching characters
	 */
	public static List<Character> findByname(String name, int start, int end) {
		return getPersistence().findByname(name, start, end);
	}

	/**
	 * Returns an ordered range of all the characters where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findByname(
		String name, int start, int end,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().findByname(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the characters where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findByname(
		String name, int start, int end,
		OrderByComparator<Character> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByname(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByname_First(
			String name, OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByname_First(name, orderByComparator);
	}

	/**
	 * Returns the first character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByname_First(
		String name, OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchByname_First(name, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findByname_Last(
			String name, OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchByname_Last(
		String name, OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the characters before and after the current character in the ordered set where name = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public static Character[] findByname_PrevAndNext(
			long characterId, String name,
			OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByname_PrevAndNext(
			characterId, name, orderByComparator);
	}

	/**
	 * Removes all the characters where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByname(String name) {
		getPersistence().removeByname(name);
	}

	/**
	 * Returns the number of characters where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching characters
	 */
	public static int countByname(String name) {
		return getPersistence().countByname(name);
	}

	/**
	 * Returns all the characters where genre = &#63;.
	 *
	 * @param genre the genre
	 * @return the matching characters
	 */
	public static List<Character> findBygenre(String genre) {
		return getPersistence().findBygenre(genre);
	}

	/**
	 * Returns a range of all the characters where genre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param genre the genre
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @return the range of matching characters
	 */
	public static List<Character> findBygenre(
		String genre, int start, int end) {

		return getPersistence().findBygenre(genre, start, end);
	}

	/**
	 * Returns an ordered range of all the characters where genre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param genre the genre
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findBygenre(
		String genre, int start, int end,
		OrderByComparator<Character> orderByComparator) {

		return getPersistence().findBygenre(
			genre, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the characters where genre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param genre the genre
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching characters
	 */
	public static List<Character> findBygenre(
		String genre, int start, int end,
		OrderByComparator<Character> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygenre(
			genre, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findBygenre_First(
			String genre, OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findBygenre_First(genre, orderByComparator);
	}

	/**
	 * Returns the first character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchBygenre_First(
		String genre, OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchBygenre_First(genre, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public static Character findBygenre_Last(
			String genre, OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findBygenre_Last(genre, orderByComparator);
	}

	/**
	 * Returns the last character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public static Character fetchBygenre_Last(
		String genre, OrderByComparator<Character> orderByComparator) {

		return getPersistence().fetchBygenre_Last(genre, orderByComparator);
	}

	/**
	 * Returns the characters before and after the current character in the ordered set where genre = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public static Character[] findBygenre_PrevAndNext(
			long characterId, String genre,
			OrderByComparator<Character> orderByComparator)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findBygenre_PrevAndNext(
			characterId, genre, orderByComparator);
	}

	/**
	 * Removes all the characters where genre = &#63; from the database.
	 *
	 * @param genre the genre
	 */
	public static void removeBygenre(String genre) {
		getPersistence().removeBygenre(genre);
	}

	/**
	 * Returns the number of characters where genre = &#63;.
	 *
	 * @param genre the genre
	 * @return the number of matching characters
	 */
	public static int countBygenre(String genre) {
		return getPersistence().countBygenre(genre);
	}

	/**
	 * Caches the character in the entity cache if it is enabled.
	 *
	 * @param character the character
	 */
	public static void cacheResult(Character character) {
		getPersistence().cacheResult(character);
	}

	/**
	 * Caches the characters in the entity cache if it is enabled.
	 *
	 * @param characters the characters
	 */
	public static void cacheResult(List<Character> characters) {
		getPersistence().cacheResult(characters);
	}

	/**
	 * Creates a new character with the primary key. Does not add the character to the database.
	 *
	 * @param characterId the primary key for the new character
	 * @return the new character
	 */
	public static Character create(long characterId) {
		return getPersistence().create(characterId);
	}

	/**
	 * Removes the character with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param characterId the primary key of the character
	 * @return the character that was removed
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public static Character remove(long characterId)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().remove(characterId);
	}

	public static Character updateImpl(Character character) {
		return getPersistence().updateImpl(character);
	}

	/**
	 * Returns the character with the primary key or throws a <code>NoSuchCharacterException</code> if it could not be found.
	 *
	 * @param characterId the primary key of the character
	 * @return the character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public static Character findByPrimaryKey(long characterId)
		throws com.the.simpsons.sb.exception.NoSuchCharacterException {

		return getPersistence().findByPrimaryKey(characterId);
	}

	/**
	 * Returns the character with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param characterId the primary key of the character
	 * @return the character, or <code>null</code> if a character with the primary key could not be found
	 */
	public static Character fetchByPrimaryKey(long characterId) {
		return getPersistence().fetchByPrimaryKey(characterId);
	}

	/**
	 * Returns all the characters.
	 *
	 * @return the characters
	 */
	public static List<Character> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the characters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @return the range of characters
	 */
	public static List<Character> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the characters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of characters
	 */
	public static List<Character> findAll(
		int start, int end, OrderByComparator<Character> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the characters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CharacterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of characters
	 * @param end the upper bound of the range of characters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of characters
	 */
	public static List<Character> findAll(
		int start, int end, OrderByComparator<Character> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the characters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of characters.
	 *
	 * @return the number of characters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CharacterPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CharacterPersistence _persistence;

}