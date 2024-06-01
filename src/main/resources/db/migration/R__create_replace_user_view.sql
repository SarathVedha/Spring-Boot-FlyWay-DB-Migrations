-- Create or replace view for user_entity, user_entity_roles and role_entity
-- This view will be used to fetch user details along with role name
-- Repeatable migration script to create or replace view for user_entity, user_entity_roles and role_entity
-- Repeatable migration script will be executed every time the application starts up if any changes are detected
CREATE OR REPLACE VIEW user_view AS
    SELECT u.id, u.name, u.email, r.name as role_name FROM user_entity u
        JOIN user_entity_roles ur ON u.id = ur.user_entity_id
        JOIN role_entity r ON ur.roles_id = r.id;