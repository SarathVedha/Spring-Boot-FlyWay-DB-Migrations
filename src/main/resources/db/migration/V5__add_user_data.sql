INSERT INTO user_entity (id, name, email) VALUES (2, 'Vijay', 'vijay@gmail.com');

INSERT INTO role_entity (id, name, description) Values (2, 'USER', 'User Role');

INSERT INTO user_entity_roles (user_entity_id, roles_id) VALUES (2, 2);