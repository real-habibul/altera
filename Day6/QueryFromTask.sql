INSERT INTO public.operators ("name", "created_at", "updated_at") VALUES ('Indosat', now(), now());
INSERT INTO public.operators ("name", "created_at", "updated_at") VALUES ('Tri', now(), now());
INSERT INTO public.operators ("name", "created_at", "updated_at") VALUES ('XL', now(), now());
INSERT INTO public.operators ("name", "created_at", "updated_at") VALUES ('Simpati', now(), now());
INSERT INTO public.operators ("name", "created_at", "updated_at") VALUES ('Smartfren', now(), now());

INSERT INTO public.product_types ("name") VALUES ('Prabayar');
INSERT INTO public.product_types ("name") VALUES ('Pasca Bayar');
INSERT INTO public.product_types ("name") VALUES ('Coming Soon');

INSERT INTO public.products (product_type_id, operator_id) VALUES (1,3);
INSERT INTO public.products (product_type_id, operator_id) VALUES (2,1);
INSERT INTO public.products (product_type_id, operator_id) VALUES (3,4);

INSERT INTO public.product_descriptions (description, created_at, updated_at) VALUES ('produk ini paling keren', now(), now());
INSERT INTO public.product_descriptions (description, created_at, updated_at) VALUES ('paling cocok untuk kamu', now(), now());
INSERT INTO public.product_descriptions (description, created_at, updated_at) VALUES ('yang paling hemat pokoknya deh', now(), now());

UPDATE public.products SET product_description_id=1 WHERE id=1;
UPDATE public.products SET product_description_id=2 WHERE id=2;
UPDATE public.products SET product_description_id=3 WHERE id=3;

INSERT INTO public.payment_methods (name, status) VALUES ('cash',1);
INSERT INTO public.payment_methods (name, status) VALUES ('paylater',1);
INSERT INTO public.payment_methods (name, status) VALUES ('Coming Soon',0);

INSERT INTO public.users (status, dob, gender) VALUES (1, '1997-10-07', 'M');
INSERT INTO public.users (status, dob, gender) VALUES (1, '2000-12-12', 'W');
INSERT INTO public.users (status, dob, gender) VALUES (1, '1996-03-04', 'W');
INSERT INTO public.users (status, dob, gender) VALUES (1, '1999-11-11', 'M');
INSERT INTO public.users (status, dob, gender) VALUES (0, '2001-08-23', 'M');

INSERT INTO public.transactions (user_id, payment_method_id, status, total_qty, total_price) VALUES (1,1,'Done', 1, 10000);
INSERT INTO public.transactions (user_id, payment_method_id, status, total_qty, total_price) VALUES (2,1,'Done', 2, 50000);
INSERT INTO public.transactions (user_id, payment_method_id, status, total_qty, total_price) VALUES (3,2,'Waiting', 5, 100000);

INSERT INTO public.transaction_details (transaction_id, product_id) VALUES (1,1);
INSERT INTO public.transaction_details (transaction_id, product_id) VALUES (2,2);
INSERT INTO public.transaction_details (transaction_id, product_id) VALUES (3,3);

SELECT * FROM public.users WHERE gender = 'M'

SELECT * FROM public.products WHERE id = 3

ALTER TABLE public.users ADD "name" varchar(100) NULL;
UPDATE public.users SET name='Ahmad Habibul Ulum' WHERE id=1;
SELECT * FROM users WHERE created_at >= date_trunc('day', now() - interval '7 days') AND name LIKE '%a%';

SELECT COUNT(id) FROM public.users WHERE gender = 'W'

SELECT * FROM public.users ORDER BY name ASC;

SELECT * FROM public.products LIMIT 5;

UPDATE public.products SET name='product dummy' WHERE id=3;

UPDATE public.transaction_details SET qty=3 WHERE id=1;

DELETE FROM public.product_types WHERE id = 1

select * from public.transactions t where t.user_id = 1
union all
select * from public.transactions t where t.user_id = 2;

select SUM(t.total_price) from public.transactions t where t.user_id = 1;

select count(td.transaction_id) from public.transaction_details td left join products p on td.product_id = p.id where p.product_type_id = 2;