ALTER TABLE "merge$mergeconfiguration" ADD "apikey" VARCHAR_IGNORECASE(2147483647) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('49365763-ac7b-418e-9961-3d1d914599a9', 
'd6b855d6-deb6-4265-be20-8479c1f6c3b8', 
'APIKey', 
'apikey', 
30, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20210616 16:18:33';
