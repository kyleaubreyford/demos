DROP FUNCTION find_all_fruit;
CREATE OR REPLACE FUNCTION find_all_fruit()
RETURNS TABLE(
	fruit_name TEXT,
	color TEXT,
	flavorrating NUMERIC(2,0)
) AS $$
BEGIN
	RETURN QUERY 
		SELECT fruit.name as fruit_name, fruit.color as color, fruit.flavorrating as flavorrating
		FROM fruit;
END;
$$ LANGUAGE plpgsql;

SELECT * FROM find_all_fruit();