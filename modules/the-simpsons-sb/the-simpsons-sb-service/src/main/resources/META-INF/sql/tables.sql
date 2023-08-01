create table THESIMPSONSAPI_Character (
	uuid_ VARCHAR(75) null,
	characterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(500) null,
	image VARCHAR(500) null,
	genre VARCHAR(75) null
);