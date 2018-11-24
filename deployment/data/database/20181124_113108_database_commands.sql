ALTER TABLE "myfirstmodule$tab" ADD "createddate" TIMESTAMP NULL;
ALTER TABLE "myfirstmodule$tab" ADD "status" VARCHAR_IGNORECASE(6) NULL;
UPDATE "myfirstmodule$tab"
 SET "status" = 'ACTIVE';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('4e632c3f-9f32-41e8-b372-b373bbfd86cc', 
'6beffa1e-3672-411c-b012-2569be3f5ee3', 
'STATUS', 
'status', 
40, 
6, 
'ACTIVE', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e5f947b0-ea32-304f-812e-58afb3319073', 
'6beffa1e-3672-411c-b012-2569be3f5ee3', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20181124 11:30:53';
