CREATE TABLE movies (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    duration INT,
    yrOfRelease INT,
    genre VARCHAR(255),

    PRIMARY KEY (id)
)