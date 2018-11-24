ALTER TABLE "myfirstmodule$qr_image" RENAME TO "b208972deedc4a1dbb7efdcf49a6d62a";
DROP INDEX "idx_system$image_submetaobjectname_asc";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = 'fd466fa4-f8e4-4eed-bd35-d5bf11751195';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = 'fd466fa4-f8e4-4eed-bd35-d5bf11751195';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = 'fd466fa4-f8e4-4eed-bd35-d5bf11751195');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = 'fd466fa4-f8e4-4eed-bd35-d5bf11751195';
ALTER TABLE "system$image" DROP COLUMN "submetaobjectname";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '272f49fe-6a64-3ede-a32d-344a34e57b9f';
DELETE FROM "mendixsystem$index" 
 WHERE "id" = '00a9ec1c-4fab-368f-83d4-ffa8ff501c8c';
DELETE FROM "mendixsystem$index_column" 
 WHERE "index_id" = '00a9ec1c-4fab-368f-83d4-ffa8ff501c8c';
CREATE TABLE "myfirstmodule$qr" (
	"id" BIGINT NOT NULL,
	"qr_string" VARCHAR_IGNORECASE(2147483647) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('d78af4d5-d2b3-4bdb-9b51-51658b215773', 
'MyFirstModule.QR', 
'myfirstmodule$qr');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('814ca933-d56c-45fc-964d-6da28eff7e7c', 
'd78af4d5-d2b3-4bdb-9b51-51658b215773', 
'QR_STRING', 
'qr_string', 
30, 
0, 
'', 
false);
DELETE FROM "system$image" 
 WHERE "id" IN (SELECT "id"
 FROM "b208972deedc4a1dbb7efdcf49a6d62a");
DELETE FROM "system$thumbnail_image" 
 WHERE "system$imageid" IN (SELECT "id"
 FROM "b208972deedc4a1dbb7efdcf49a6d62a");
DELETE FROM "system$filedocument" 
 WHERE "id" IN (SELECT "id"
 FROM "b208972deedc4a1dbb7efdcf49a6d62a");
DROP TABLE "b208972deedc4a1dbb7efdcf49a6d62a";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20181124 13:25:14';
