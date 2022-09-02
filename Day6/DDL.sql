CREATE SCHEMA "alta_online_shop";

CREATE TABLE "alta_online_shop"."user" (
  "id" int PRIMARY KEY,
  "nama" varchar,
  "alamat" varchar,
  "tanggal_lahir" varchar,
  "status_user" varchar,
  "gender" varchar,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "alta_online_shop"."product" (
  "id" int PRIMARY KEY,
  "product_name" varchar,
  "product_type" varchar,
  "operators" varchar,
  "product_description" text,
  "payment_method" varchar,
  "created_at" timestamp,
  "updated_at" timestamp
);

CREATE TABLE "alta_online_shop"."transaction" (
  "id" int PRIMARY KEY,
  "transaction" varchar,
  "transaction_detail" text,
  "created_at" timestamp,
  "updated_at" timestamp
);

ALTER TABLE "alta_online_shop"."product" ADD FOREIGN KEY ("product_description") REFERENCES "alta_online_shop"."product" ("payment_method");

ALTER TABLE "alta_online_shop"."user" ADD FOREIGN KEY ("alamat") REFERENCES "alta_online_shop"."user" ("nama");

CREATE TABLE "user_product" (
  "user_id" int NOT NULL,
  "product_payment_method" varchar NOT NULL,
  PRIMARY KEY ("user_id", "product_payment_method")
);

ALTER TABLE "user_product" ADD FOREIGN KEY ("user_id") REFERENCES "alta_online_shop"."user" ("id");

ALTER TABLE "user_product" ADD FOREIGN KEY ("product_payment_method") REFERENCES "alta_online_shop"."product" ("payment_method");

