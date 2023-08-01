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

package com.the.simpsons.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Character}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Character
 * @generated
 */
public class CharacterWrapper
	extends BaseModelWrapper<Character>
	implements Character, ModelWrapper<Character> {

	public CharacterWrapper(Character character) {
		super(character);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("characterId", getCharacterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("image", getImage());
		attributes.put("genre", getGenre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long characterId = (Long)attributes.get("characterId");

		if (characterId != null) {
			setCharacterId(characterId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String genre = (String)attributes.get("genre");

		if (genre != null) {
			setGenre(genre);
		}
	}

	/**
	 * Returns the character ID of this character.
	 *
	 * @return the character ID of this character
	 */
	@Override
	public long getCharacterId() {
		return model.getCharacterId();
	}

	/**
	 * Returns the company ID of this character.
	 *
	 * @return the company ID of this character
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this character.
	 *
	 * @return the create date of this character
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this character.
	 *
	 * @return the description of this character
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the genre of this character.
	 *
	 * @return the genre of this character
	 */
	@Override
	public String getGenre() {
		return model.getGenre();
	}

	/**
	 * Returns the group ID of this character.
	 *
	 * @return the group ID of this character
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the image of this character.
	 *
	 * @return the image of this character
	 */
	@Override
	public String getImage() {
		return model.getImage();
	}

	/**
	 * Returns the modified date of this character.
	 *
	 * @return the modified date of this character
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this character.
	 *
	 * @return the name of this character
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this character.
	 *
	 * @return the primary key of this character
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this character.
	 *
	 * @return the user ID of this character
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this character.
	 *
	 * @return the user name of this character
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this character.
	 *
	 * @return the user uuid of this character
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this character.
	 *
	 * @return the uuid of this character
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the character ID of this character.
	 *
	 * @param characterId the character ID of this character
	 */
	@Override
	public void setCharacterId(long characterId) {
		model.setCharacterId(characterId);
	}

	/**
	 * Sets the company ID of this character.
	 *
	 * @param companyId the company ID of this character
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this character.
	 *
	 * @param createDate the create date of this character
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this character.
	 *
	 * @param description the description of this character
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the genre of this character.
	 *
	 * @param genre the genre of this character
	 */
	@Override
	public void setGenre(String genre) {
		model.setGenre(genre);
	}

	/**
	 * Sets the group ID of this character.
	 *
	 * @param groupId the group ID of this character
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the image of this character.
	 *
	 * @param image the image of this character
	 */
	@Override
	public void setImage(String image) {
		model.setImage(image);
	}

	/**
	 * Sets the modified date of this character.
	 *
	 * @param modifiedDate the modified date of this character
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this character.
	 *
	 * @param name the name of this character
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this character.
	 *
	 * @param primaryKey the primary key of this character
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this character.
	 *
	 * @param userId the user ID of this character
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this character.
	 *
	 * @param userName the user name of this character
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this character.
	 *
	 * @param userUuid the user uuid of this character
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this character.
	 *
	 * @param uuid the uuid of this character
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected CharacterWrapper wrap(Character character) {
		return new CharacterWrapper(character);
	}

}