INSERT INTO books (name, author)
VALUES ('Clean Code', 'Robert Martin');

INSERT INTO books (name, author)
VALUES ('Java Basics', 'John Doe');

insert into users(name,username, password, enabled) values
('Niaht','nihat','$2a$10$T92Jm6b2X0loXed.EmRC/./hAgE39DQUKRnaHNaoqyNfp82WoYRGS', true),
('Deniz','deniz','$2a$10$T92Jm6b2X0loXed.EmRC/./hAgE39DQUKRnaHNaoqyNfp82WoYRGS', true);

--insert into authority_list(authority) values
--('ROLE_GET_BOOKS'),
--('ROLE_ADD_BOOKS'),
--('ROLE_DELETE_BOOKS'),
--('ROLE_UPDATE_BOOKS');

insert into roles(name,librarian,student) values
('ROLE_GET_BOOKS',1,1),
('ROLE_ADD_BOOKS',1,0),
('ROLE_DELETE_BOOKS',1,0),
('ROLE_UPDATE_BOOKS',1,0);

insert into user_roles(user_id,role_id)
values
(1,1),
(2,1),
(2,2),
(2,3),
(2,4);

--insert into authorities(username, authority) values
--('nihat', 'ROLE_GET_BOOKS'),
--('admin', 'ROLE_GET_BOOKS'),
--('admin', 'ROLE_ADD_BOOKS'),
--('admin', 'ROLE_DELETE_BOOKS'),
--('admin', 'ROLE_UPDATE_BOOKS');