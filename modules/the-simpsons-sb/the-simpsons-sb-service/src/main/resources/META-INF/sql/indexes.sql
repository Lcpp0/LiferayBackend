create index IX_8C686E94 on THESIMPSONSAPI_Character (genre[$COLUMN_LENGTH:75$]);
create index IX_41CCC47E on THESIMPSONSAPI_Character (name[$COLUMN_LENGTH:75$]);
create index IX_F560D033 on THESIMPSONSAPI_Character (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A535C775 on THESIMPSONSAPI_Character (uuid_[$COLUMN_LENGTH:75$], groupId);