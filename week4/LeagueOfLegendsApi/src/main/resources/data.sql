set schema 'league';
INSERT INTO champions (champion_name, champion_role) VALUES 
	('Ashe', 'ADC'),
	('Ziggs', 'MAGE'),
	('Kassadin', 'ASSASSIN'),
	('Talon', 'ASSASSIN'),
	('Leona', 'SUPPORT'),
	('Nami', 'SUPPORT'),
	('Olaf', 'FIGHTER');

INSERT INTO user_roles (role_name) VALUES
	('ADMIN'),
	('EMPLOYEE');
	
INSERT INTO app_users (username, pass, role_id) VALUES
	('blake', 'pass', (SELECT role_id FROM user_roles WHERE role_name = 'ADMIN')),
	('an', 'pass', (SELECT role_id FROM user_roles WHERE role_name = 'EMPLOYEE'));