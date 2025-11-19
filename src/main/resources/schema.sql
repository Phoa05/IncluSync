CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    name VARCHAR(255),
    password VARCHAR(255),
    has_mobility_issue BOOLEAN,
    access VARCHAR(255)
);


CREATE TABLE stations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    temperature VARCHAR(255),
    crowd_level INT,
    elevator_status VARCHAR(255),
    overall_status VARCHAR(255),
    updated_at TIMESTAMP
);
