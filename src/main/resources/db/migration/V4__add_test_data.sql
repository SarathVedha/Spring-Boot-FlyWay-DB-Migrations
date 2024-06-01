INSERT INTO user_entity (id, name, email) VALUES (1, 'Vedha', 'vedha@gmail.com');

INSERT INTO role_entity (id, name, description) Values (1, 'ADMIN', 'Admin Role');

INSERT INTO user_entity_roles (user_entity_id, roles_id) VALUES (1, 1);
