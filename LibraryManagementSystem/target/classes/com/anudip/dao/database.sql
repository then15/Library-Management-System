CREATE DATABASE librarydb;
USE librarydb;

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    publisher VARCHAR(100),
    available BOOLEAN
);

CREATE TABLE members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15)
);

CREATE TABLE issues (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bookId INT,
    memberId INT,
    issueDate DATE,
    returnDate DATE,
    FOREIGN KEY (bookId) REFERENCES books(id),
    FOREIGN KEY (memberId) REFERENCES members(id)
);
