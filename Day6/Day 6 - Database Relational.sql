CREATE TABLE [product_types] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [name] varchar(255),
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [operators] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [name] varchar(255),
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [product_descriptions] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [description] text,
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [payment_methods] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [name] varchar(255),
  [status] smallint,
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [users] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [status] smallint,
  [dob] date,
  [gender] char(1),
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [products] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [product_type_id] int(11),
  [operator_id] int(11),
  [product_description_id] int(11),
  [code] varchar(50),
  [name] varchar(100),
  [status] smallint,
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [transactions] (
  [id] int(11) PRIMARY KEY IDENTITY(1, 1),
  [user_id] int(11),
  [payment_method_id] int(11),
  [status] varchar(10),
  [total_qty] int(11),
  [total_price] numeric(25,2),
  [created_at] timestamp,
  [updated_at] timestamp
)
GO

CREATE TABLE [transaction_details] (
  [transaction_id] int(11),
  [product_id] int(11),
  [status] varchar(10),
  [qty] int(11),
  [price] numeric(25,2),
  [created_at] timestamp,
  [updated_at] timestamp,
  PRIMARY KEY ([transaction_id], [product_id])
)
GO

ALTER TABLE [transactions] ADD FOREIGN KEY ([payment_method_id]) REFERENCES [payment_methods] ([id])
GO

ALTER TABLE [transactions] ADD FOREIGN KEY ([user_id]) REFERENCES [users] ([id])
GO

CREATE TABLE [transactions_transaction_details] (
  [transactions_id] int(11) NOT NULL,
  [transaction_details_transaction_id] int(11) NOT NULL,
  PRIMARY KEY ([transactions_id], [transaction_details_transaction_id])
);
GO

ALTER TABLE [transactions_transaction_details] ADD FOREIGN KEY ([transactions_id]) REFERENCES [transactions] ([id]);
GO

ALTER TABLE [transactions_transaction_details] ADD FOREIGN KEY ([transaction_details_transaction_id]) REFERENCES [transaction_details] ([transaction_id]);
GO


ALTER TABLE [products] ADD FOREIGN KEY ([product_description_id]) REFERENCES [product_descriptions] ([id])
GO

ALTER TABLE [products] ADD FOREIGN KEY ([product_type_id]) REFERENCES [product_types] ([id])
GO

ALTER TABLE [products] ADD FOREIGN KEY ([operator_id]) REFERENCES [operators] ([id])
GO

CREATE TABLE [products_transaction_details] (
  [products_id] int(11) NOT NULL,
  [transaction_details_product_id] int(11) NOT NULL,
  PRIMARY KEY ([products_id], [transaction_details_product_id])
);
GO

ALTER TABLE [products_transaction_details] ADD FOREIGN KEY ([products_id]) REFERENCES [products] ([id]);
GO

ALTER TABLE [products_transaction_details] ADD FOREIGN KEY ([transaction_details_product_id]) REFERENCES [transaction_details] ([product_id]);
GO

