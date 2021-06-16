CREATE TABLE "merge$mergeconfiguration" (
	"id" BIGINT NOT NULL,
	"organizationname" VARCHAR_IGNORECASE(200) NULL,
	"organizationid" VARCHAR_IGNORECASE(200) NULL,
	"emailaddress" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('d6b855d6-deb6-4265-be20-8479c1f6c3b8', 
'Merge.MergeConfiguration', 
'merge$mergeconfiguration', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('36e67a02-314b-413b-b304-38ce77bca220', 
'd6b855d6-deb6-4265-be20-8479c1f6c3b8', 
'OrganizationName', 
'organizationname', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('2c413442-00d6-400a-a15d-6f82da5356fe', 
'd6b855d6-deb6-4265-be20-8479c1f6c3b8', 
'OrganizationId', 
'organizationid', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('27159aef-aeb2-4000-8fe9-451aba26714b', 
'd6b855d6-deb6-4265-be20-8479c1f6c3b8', 
'EmailAddress', 
'emailaddress', 
30, 
200, 
'', 
false);
CREATE TABLE "merge$mergeconfiguration_category" (
	"merge$mergeconfigurationid" BIGINT NOT NULL,
	"merge$categoryid" BIGINT NOT NULL,
	PRIMARY KEY("merge$mergeconfigurationid","merge$categoryid"));
CREATE INDEX "idx_merge$mergeconfiguration_category_merge$category_merge$mergeconfiguration" ON "merge$mergeconfiguration_category" ("merge$categoryid" ASC,"merge$mergeconfigurationid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('4702ef62-3e1c-4e4c-a9d5-fe638eb2ccaa', 
'Merge.MergeConfiguration_Category', 
'merge$mergeconfiguration_category', 
'd6b855d6-deb6-4265-be20-8479c1f6c3b8', 
'793a833e-8bd0-482c-a386-1af4cd224dc1', 
'merge$mergeconfigurationid', 
'merge$categoryid', 
'idx_merge$mergeconfiguration_category_merge$category_merge$mergeconfiguration');
CREATE TABLE "merge$category" (
	"id" BIGINT NOT NULL,
	"name" VARCHAR_IGNORECASE(10) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('793a833e-8bd0-482c-a386-1af4cd224dc1', 
'Merge.Category', 
'merge$category', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('dacc1cc3-923c-4e05-a792-0d3c5dfe4f0e', 
'793a833e-8bd0-482c-a386-1af4cd224dc1', 
'Name', 
'name', 
40, 
10, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210616 15:14:20';
