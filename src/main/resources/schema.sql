CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL,
    age INT NOT NULL,  -- Age of the user
    email VARCHAR(100) UNIQUE NOT NULL
    password VARCHAR(100) NOT NULL
    verified BOOLEAN NOT NULL,
);

INSERT INTO users (username, password, age, email, verified)
VALUES
    ('joe123', 'hashed_password_joe', 12, 'email@email.email', false),
    ('jessy22', 'hashed_password_jessy', 22, 'email2@email2.email', false),
    ('mike30', 'hashed_password_mike', 30, 'email3@email3.email', true),
    ('alice25', 'hashed_password_alice', 25, 'email4@email4.email', true),
    ('bob28', 'hashed_password_bob', 28, 'email5@email5.email', false);