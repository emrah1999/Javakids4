INSERT INTO books (name, author)
VALUES ('Clean Code', 'Robert Martin');

INSERT INTO books (name, author)
VALUES ('Java Basics', 'John Doe');

insert into users(username, password, enabled) values
('nihat','{noop}123', true),
('admin','{noop}admin', true);

--insert into authority_list(authority) values
--('ROLE_GET_BOOKS'),
--('ROLE_ADD_BOOKS'),
--('ROLE_DELETE_BOOKS'),
--('ROLE_UPDATE_BOOKS');

insert into roles(name) values
('ROLE_GET_BOOKS'),
('ROLE_ADD_BOOKS'),
('ROLE_DELETE_BOOKS'),
('ROLE_UPDATE_BOOKS');

insert into user_roles(user_id,role_id)
values
(1,1);

--insert into authorities(username, authority) values
--('nihat', 'ROLE_GET_BOOKS'),
--('admin', 'ROLE_GET_BOOKS'),
--('admin', 'ROLE_ADD_BOOKS'),
--('admin', 'ROLE_DELETE_BOOKS'),
--('admin', 'ROLE_UPDATE_BOOKS');