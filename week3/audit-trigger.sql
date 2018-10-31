-- CREATE TABLE users_audit(
-- 	entry_id SERIAL PRIMARY KEY,
-- 	old_id INTEGER,
-- 	new_id INTEGER,
-- 	old_name TEXT,
-- 	new_name TEXT,
-- 	old_age INTEGER,
-- 	new_age INTEGER
-- );

-- CREATE OR REPLACE FUNCTION users_audit_trig_function()
-- RETURNS TRIGGER AS $$
-- BEGIN
-- 	IF(TG_OP = 'INSERT') THEN
-- 		INSERT INTO users_audit (
-- 			new_id,
-- 			new_name,
-- 			new_age
-- 		) VALUES (
-- 			NEW.id,
-- 			NEW.name,
-- 			NEW.age
-- 		);
-- 	END IF;
-- 	IF(TG_OP = 'UPDATE') THEN
-- 		INSERT INTO users_audit (
-- 			old_id,
-- 			old_name,
-- 			old_age,
-- 			new_id,
-- 			new_name,
-- 			new_age
-- 		) VALUES (
-- 			OLD.id,
-- 			OLD.name,
-- 			OLD.age,
-- 			NEW.id,
-- 			NEW.name,
-- 			NEW.age
-- 		);
-- 	END IF;
-- 	IF(TG_OP = 'DELETE') THEN
-- 		INSERT INTO users_audit (
-- 			old_id,
-- 			old_name,
-- 			old_age
-- 		) VALUES (
-- 			OLD.id,
-- 			OLD.name,
-- 			OLD.age
-- 		);
-- 	END IF;
-- 	RETURN NEW; -- return new so that it will put the data into the users table still
-- END;
-- $$ LANGUAGE plpgsql;

-- CREATE TRIGGER users_audit_trig
-- BEFORE INSERT OR UPDATE OR DELETE ON users
-- FOR EACH ROW
-- EXECUTE PROCEDURE users_audit_trig_function();

UPDATE users SET age = 96 WHERE name = 'Clark';


SELECT * FROM users_audit;