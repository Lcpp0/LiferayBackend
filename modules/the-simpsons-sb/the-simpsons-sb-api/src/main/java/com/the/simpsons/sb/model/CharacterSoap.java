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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.the.simpsons.sb.service.http.CharacterServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CharacterSoap implements Serializable {

	public static CharacterSoap toSoapModel(Character model) {
		CharacterSoap soapModel = new CharacterSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCharacterId(model.getCharacterId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setImage(model.getImage());
		soapModel.setGenre(model.getGenre());

		return soapModel;
	}

	public static CharacterSoap[] toSoapModels(Character[] models) {
		CharacterSoap[] soapModels = new CharacterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CharacterSoap[][] toSoapModels(Character[][] models) {
		CharacterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CharacterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CharacterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CharacterSoap[] toSoapModels(List<Character> models) {
		List<CharacterSoap> soapModels = new ArrayList<CharacterSoap>(
			models.size());

		for (Character model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CharacterSoap[soapModels.size()]);
	}

	public CharacterSoap() {
	}

	public long getPrimaryKey() {
		return _characterId;
	}

	public void setPrimaryKey(long pk) {
		setCharacterId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCharacterId() {
		return _characterId;
	}

	public void setCharacterId(long characterId) {
		_characterId = characterId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	public String getGenre() {
		return _genre;
	}

	public void setGenre(String genre) {
		_genre = genre;
	}

	private String _uuid;
	private long _characterId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private String _image;
	private String _genre;

}