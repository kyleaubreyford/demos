SELECT * FROM fruit f
FULL JOIN users_fruit uf
ON (f.id = uf.fruit_id)
FULL JOIN users u
ON (u.id = uf.user_id)

