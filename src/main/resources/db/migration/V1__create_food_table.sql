CREATE TABLE food(
    id integer generated always as identity primary key,
    name varchar(255),
    brand varchar(255),
    product varchar(255),
    calories decimal
)