SET SCHEMA 'chinook';

-- self join, maybe not the most useful but will find all users where their 
-- last name lines up with anothers first name
SELECT one.firstname, one.lastname, two.firstname, two.lastname
FROM customer one
INNER JOIN customer two
ON (UPPER(one.firstname) = UPPER(two.lastname));

