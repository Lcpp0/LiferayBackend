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

package com.the.simpsons.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.the.simpsons.sb.model.Character;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Character in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CharacterCacheModel
	implements CacheModel<Character>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CharacterCacheModel)) {
			return false;
		}

		CharacterCacheModel characterCacheModel = (CharacterCacheModel)object;

		if (characterId == characterCacheModel.characterId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, characterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", characterId=");
		sb.append(characterId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", image=");
		sb.append(image);
		sb.append(", genre=");
		sb.append(genre);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Character toEntityModel() {
		CharacterImpl characterImpl = new CharacterImpl();

		if (uuid == null) {
			characterImpl.setUuid("");
		}
		else {
			characterImpl.setUuid(uuid);
		}

		characterImpl.setCharacterId(characterId);
		characterImpl.setGroupId(groupId);
		characterImpl.setCompanyId(companyId);
		characterImpl.setUserId(userId);

		if (userName == null) {
			characterImpl.setUserName("");
		}
		else {
			characterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			characterImpl.setCreateDate(null);
		}
		else {
			characterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			characterImpl.setModifiedDate(null);
		}
		else {
			characterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			characterImpl.setName("");
		}
		else {
			characterImpl.setName(name);
		}

		if (description == null) {
			characterImpl.setDescription("");
		}
		else {
			characterImpl.setDescription(description);
		}

		if (image == null) {
			characterImpl.setImage("");
		}
		else {
			characterImpl.setImage(image);
		}

		if (genre == null) {
			characterImpl.setGenre("");
		}
		else {
			characterImpl.setGenre(genre);
		}

		characterImpl.resetOriginalValues();

		return characterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		characterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		image = objectInput.readUTF();
		genre = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(characterId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (image == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(image);
		}

		if (genre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(genre);
		}
	}

	public String uuid;
	public long characterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public String image;
	public String genre;

}