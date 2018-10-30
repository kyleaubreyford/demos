CREATE TABLE users
(
	id SERIAL PRIMARY KEY,
	name TEXT,
	age NUMERIC(3)
);

CREATE TABLE users_fruit
(
	user_id INT NOT NULL,
	fruit_id INT NOT NULL,
	CONSTRAINT pk_users_fruit PRIMARY KEY (user_id, fruit_id)
);