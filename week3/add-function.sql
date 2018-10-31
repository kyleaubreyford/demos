CREATE OR REPLACE FUNCTION my_sum(val_a INTEGER, val_b INTEGER)
RETURNS INTEGER AS $$ -- Delimiter
	BEGIN -- starts a transaction
		RETURN val_a + val_b;
	END;
$$ LANGUAGE plpgsql;

-- SELECT my_sum(5, 25);

-- DROP FUNCTION my_sum;