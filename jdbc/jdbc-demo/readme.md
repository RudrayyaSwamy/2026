

```sql

CREATE DATABASE jdbc_demo;
USE jdbc_demo;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO users (username, email, password_hash) VALUES
('user11', 'user1@gmail.com', 'hash_user1'),
('user12', 'user2@gmail.com', 'hash_user2'),
('user13', 'user3@gmail.com', 'hash_user3');

DELIMITER $$

CREATE PROCEDURE all_users()
BEGIN
    SELECT id, username, email, created_at FROM users;
END$$

DELIMITER ;

```

```sql

call all_users();

```

| id | username | email            | created_at           |
|----|----------|------------------|----------------------|
| 1  | user11   | user1@gmail.com  | 23-12-2025 20:29     |
| 2  | user12   | user2@gmail.com  | 23-12-2025 20:29     |
| 3  | user13   | user3@gmail.com  | 23-12-2025 20:29     |
| 4  | a        | b                | 23-12-2025 21:18     |
| 6  | a1       | b1               | 23-12-2025 21:19     |

