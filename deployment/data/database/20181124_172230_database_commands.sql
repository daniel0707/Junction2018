ALTER TABLE "myfirstmodule$product" ADD "productowner" VARCHAR_IGNORECASE(5) NULL;
UPDATE "myfirstmodule$product"
 SET "productowner" = 'Me';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('1bb8fe41-a530-4b16-a0e5-eadf7800580d', 
'b872c1a7-4c0c-4f58-b210-1d2a3fd66755', 
'ProductOwner', 
'productowner', 
40, 
5, 
'Me', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20181124 17:22:28';
