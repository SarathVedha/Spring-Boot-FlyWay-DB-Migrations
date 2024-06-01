CREATE TABLE user_entity_roles
(
    user_entity_id BIGINT NOT NULL,
    roles_id       BIGINT NOT NULL,
    CONSTRAINT pk_userentity_roles PRIMARY KEY (user_entity_id, roles_id)
);

ALTER TABLE user_entity_roles
    ADD CONSTRAINT uc_user_entity_roles_roles UNIQUE (roles_id);

ALTER TABLE user_entity_roles
    ADD CONSTRAINT fk_useentrol_on_role_entity FOREIGN KEY (roles_id) REFERENCES role_entity (id);

ALTER TABLE user_entity_roles
    ADD CONSTRAINT fk_useentrol_on_user_entity FOREIGN KEY (user_entity_id) REFERENCES user_entity (id);