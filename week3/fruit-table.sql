CREATE TABLE fruit
(
	id SERIAL PRIMARY KEY,
	name TEXT NOT NULL UNIQUE,
	color TEXT,
	flavorRating NUMERIC(2) CHECK (flavorRating >= 0 AND flavorRating <= 10)
);