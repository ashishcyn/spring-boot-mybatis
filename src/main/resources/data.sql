DROP TABLE IF EXISTS users;

CREATE TABLE users (
id INT AUTO_INCREMENT  PRIMARY KEY,
name VARCHAR(250) NOT NULL,
salary INT DEFAULT NULL
);

INSERT INTO users (name, salary) VALUES
('John', '20000'),
('Ashi', '30000'),
('Diana', '28000');