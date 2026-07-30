CREATE TABLE books(
id BIGINT PRIMARY KEY,
title VARCHAR(50),
price decimal(10,2)
);

CREATE TABLE products(
id BIGINT PRIMARY KEY auto_increment,
name VARCHAR(50),
price decimal( 10,2),
barcode varchar(50)
);

insert into books(id, title, price)
values
(1, 'The Great Gatsby', 10.99),
(2, 'To Kill a Mockingbird', 7.99),
(3, '1984', 8.99)
;

insert into products( name, price,barcode)
values
('The Great Gatsby', 10.99, '352352323'),
('To Kill a Mockingbird', 7.99, '3463463463'),
('1984', 8.99, '234234234');

insert into persons(name, email)
values
('Arif', 'Arif@gmail.com'),
('Nihat', 'nihat@gmail.com'),
('Teymur', 'teymur@gmail.com'),
('Sevin', 'sevin@gmail.com');