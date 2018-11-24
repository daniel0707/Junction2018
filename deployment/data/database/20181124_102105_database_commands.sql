CREATE SEQUENCE "myfirstmodule$product_product_id_mxseq" AS BIGINT START WITH 1;
ALTER TABLE "myfirstmodule$product" ADD "product_id" BIGINT NULL;
UPDATE "myfirstmodule$product"
 SET "product_id" = NEXT VALUE FOR "myfirstmodule$product_product_id_mxseq";
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('71b60526-ea45-4ae4-be26-6e60be2db339', 
'b872c1a7-4c0c-4f58-b210-1d2a3fd66755', 
'Product_ID', 
'product_id', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('71b60526-ea45-4ae4-be26-6e60be2db339', 
'myfirstmodule$product_product_id_mxseq', 
1, 
0);
CREATE SEQUENCE "myfirstmodule$transaction_transaction_id_mxseq" AS BIGINT START WITH 1;
ALTER TABLE "myfirstmodule$transaction" ADD "transaction_id" BIGINT NULL;
UPDATE "myfirstmodule$transaction"
 SET "transaction_id" = NEXT VALUE FOR "myfirstmodule$transaction_transaction_id_mxseq";
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('42950dd6-618c-47d2-b413-007a132fb20d', 
'1581aa59-8aa8-4ec7-9d48-6c4c8697a0b9', 
'Transaction_ID', 
'transaction_id', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('42950dd6-618c-47d2-b413-007a132fb20d', 
'myfirstmodule$transaction_transaction_id_mxseq', 
1, 
0);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20181124 10:21:03';
