CREATE TABLE books(
id BIGINT PRIMARY KEY,
title VARCHAR( 50),
price decimal( 10,2)
);

insert into books(id, title, price)
values
(1, 'The Great Gatsby', 10.99),
(2, 'To Kill a Mockingbird', 7.99),
(3, '1984', 8.99)
;