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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.the.simpsons.sb.exception.NoSuchCharacterException;
import com.the.simpsons.sb.model.Character;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the character service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CharacterUtil
 * @generated
 */
@ProviderType
public interface CharacterPersistence extends BasePersistence<Character> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CharacterUtil} to access the character persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the characters where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching characters
	 */
	public java.util.List<Character> findByUuid(String uuid);

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
	public java.util.List<Character> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Character> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

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
	public java.util.List<Character> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the first character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the last character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the last character in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the characters before and after the current character in the ordered set where uuid = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public Character[] findByUuid_PrevAndNext(
			long characterId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Removes all the characters where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of characters where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching characters
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the character where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCharacterException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByUUID_G(String uuid, long groupId)
		throws NoSuchCharacterException;

	/**
	 * Returns the character where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the character where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the character where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the character that was removed
	 */
	public Character removeByUUID_G(String uuid, long groupId)
		throws NoSuchCharacterException;

	/**
	 * Returns the number of characters where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching characters
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the characters where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching characters
	 */
	public java.util.List<Character> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Character> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Character> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

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
	public java.util.List<Character> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the first character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the last character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the last character in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

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
	public Character[] findByUuid_C_PrevAndNext(
			long characterId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Removes all the characters where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of characters where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching characters
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the characters where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching characters
	 */
	public java.util.List<Character> findByname(String name);

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
	public java.util.List<Character> findByname(
		String name, int start, int end);

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
	public java.util.List<Character> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

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
	public java.util.List<Character> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByname_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the first character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByname_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the last character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findByname_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the last character in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchByname_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the characters before and after the current character in the ordered set where name = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public Character[] findByname_PrevAndNext(
			long characterId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Removes all the characters where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByname(String name);

	/**
	 * Returns the number of characters where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching characters
	 */
	public int countByname(String name);

	/**
	 * Returns all the characters where genre = &#63;.
	 *
	 * @param genre the genre
	 * @return the matching characters
	 */
	public java.util.List<Character> findBygenre(String genre);

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
	public java.util.List<Character> findBygenre(
		String genre, int start, int end);

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
	public java.util.List<Character> findBygenre(
		String genre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

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
	public java.util.List<Character> findBygenre(
		String genre, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findBygenre_First(
			String genre,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the first character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchBygenre_First(
		String genre,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the last character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character
	 * @throws NoSuchCharacterException if a matching character could not be found
	 */
	public Character findBygenre_Last(
			String genre,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Returns the last character in the ordered set where genre = &#63;.
	 *
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching character, or <code>null</code> if a matching character could not be found
	 */
	public Character fetchBygenre_Last(
		String genre,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

	/**
	 * Returns the characters before and after the current character in the ordered set where genre = &#63;.
	 *
	 * @param characterId the primary key of the current character
	 * @param genre the genre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public Character[] findBygenre_PrevAndNext(
			long characterId, String genre,
			com.liferay.portal.kernel.util.OrderByComparator<Character>
				orderByComparator)
		throws NoSuchCharacterException;

	/**
	 * Removes all the characters where genre = &#63; from the database.
	 *
	 * @param genre the genre
	 */
	public void removeBygenre(String genre);

	/**
	 * Returns the number of characters where genre = &#63;.
	 *
	 * @param genre the genre
	 * @return the number of matching characters
	 */
	public int countBygenre(String genre);

	/**
	 * Caches the character in the entity cache if it is enabled.
	 *
	 * @param character the character
	 */
	public void cacheResult(Character character);

	/**
	 * Caches the characters in the entity cache if it is enabled.
	 *
	 * @param characters the characters
	 */
	public void cacheResult(java.util.List<Character> characters);

	/**
	 * Creates a new character with the primary key. Does not add the character to the database.
	 *
	 * @param characterId the primary key for the new character
	 * @return the new character
	 */
	public Character create(long characterId);

	/**
	 * Removes the character with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param characterId the primary key of the character
	 * @return the character that was removed
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public Character remove(long characterId) throws NoSuchCharacterException;

	public Character updateImpl(Character character);

	/**
	 * Returns the character with the primary key or throws a <code>NoSuchCharacterException</code> if it could not be found.
	 *
	 * @param characterId the primary key of the character
	 * @return the character
	 * @throws NoSuchCharacterException if a character with the primary key could not be found
	 */
	public Character findByPrimaryKey(long characterId)
		throws NoSuchCharacterException;

	/**
	 * Returns the character with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param characterId the primary key of the character
	 * @return the character, or <code>null</code> if a character with the primary key could not be found
	 */
	public Character fetchByPrimaryKey(long characterId);

	/**
	 * Returns all the characters.
	 *
	 * @return the characters
	 */
	public java.util.List<Character> findAll();

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
	public java.util.List<Character> findAll(int start, int end);

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
	public java.util.List<Character> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator);

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
	public java.util.List<Character> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Character>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the characters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of characters.
	 *
	 * @return the number of characters
	 */
	public int countAll();

}