set schema 'league';

CREATE TABLE user_roles
(
	role_id SERIAL PRIMARY KEY,
	role_name TEXT NOT NULL UNIQUE
);

CREATE TABLE app_users
(
	user_id SERIAL PRIMARY KEY,
	username TEXT NOT NULL UNIQUE,
	pass TEXT NOT NULL,
	role_id INT REFERENCES user_roles(role_id)
);

CREATE TABLE champions
(
	champion_id SERIAL PRIMARY KEY,
	champion_name TEXT,
	champion_role TEXT
);
