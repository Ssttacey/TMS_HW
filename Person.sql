create table Person
(
	id INT UNIQUE,
	name VARCHAR(50),
	surname VARCHAR(50),
	age INT NOT NULL,
	passport_number VARCHAR(50) UNIQUE
	
	INSERT INTO Person (id, name, surname, age, passport_number) VALUES (1, 'Ivan', 'Ivanov', 57, 'MC56789043');
	INSERT INTO Person (id, name, surname, age, passport_number) VALUES (2, 'Sacha', 'Korolev', 34, 'HR1234567');
	INSERT INTO Person (id, name, surname, age, passport_number) VALUES (3, 'Fedor', 'Sidorov', 20, 'LM9876456');
	INSERT INTO Person (id, name, surname, age, passport_number) VALUES (4, 'Alexey', 'Novik', 55, 'NM2341232');
    INSERT INTO Person (id, name, surname, age, passport_number) VALUES (5, 'Renat', 'Letov', 27, 'MK34561827');

    Select * FROM Person

    UPDATE Person SET age = 50 WHERE name = 'Ivan'
	DELETE FROM Person WHERE age > 50
);

