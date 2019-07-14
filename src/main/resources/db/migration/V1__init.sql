CREATE TABLE movies(
    id BIGSERIAL NOT NULL CONSTRAINT movies_pkey, PRIMARY KEY,
    title VARCHAR(100) NOT NULL
);

INSERT INTO movies('Movie 1');
INSERT INTO movies('Movie 2');
INSERT INTO movies('Movie 3');
INSERT INTO movies('Movie 4');
INSERT INTO movies('Movie 5');
