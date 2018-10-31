-- CREATE OR REPLACE FUNCTION add_favorite_fruit(user_name TEXT, fruit_name TEXT)
-- RETURNS void AS $$
-- DECLARE
-- 	user_id INTEGER;
-- 	fruit_id INTEGER;
-- BEGIN
-- 	SELECT id INTO user_id FROM users WHERE name = user_name;
-- 	SELECT id INTO fruit_id FROM fruit WHERE name = fruit_name;
	
-- 	INSERT INTO users_fruit (user_id, fruit_id) VALUES (user_id, fruit_id);
-- END;
-- $$ LANGUAGE plpgsql;

SELECT add_favorite_fruit('Kyle', 'socks');