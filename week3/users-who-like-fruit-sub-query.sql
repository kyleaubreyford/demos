SELECT * FROM users
WHERE id IN (
	SELECT user_id FROM users_fruit
	WHERE fruit_id = (
		SELECT id FROM fruit 
		WHERE name = 'mango'
		));