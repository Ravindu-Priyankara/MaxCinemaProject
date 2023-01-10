
CREATE TABLE IF NOT EXISTS Users(
    id int PRIMARY KEY UNIQUE,
    username varchar(255) check (length(username)> 5) not null ,
    password varchar(255) check ( length(password) > 8 ) not null ,
    phone_number varchar(10) not null,
    email varchar(255) not null unique

);

CREATE TABLE IF NOT EXISTS seat(
    seat_no int primary key ,
    status boolean not null,
    user_id int not null
);

CREATE TABLE IF NOT EXISTS Movies(
    id int PRIMARY KEY UNIQUE ,
    name varchar(255) not null ,
    release_date date,
    img_link varchar(255) not null
);

CREATE TABLE if not exists seats(
    seat_no int primary key ,
    status boolean not null,
    user_id int not null,
    CONSTRAINT fk_seat foreign key (user_id) references Users(id)
);
/*CREATE FUNCTION delete_old_rows() RETURNS trigger
    LANGUAGE plpgsql
AS $$
DECLARE
    row_count int;
BEGIN
    DELETE FROM seat WHERE status = false;
    IF found THEN
        GET DIAGNOSTICS row_count = ROW_COUNT;
        RAISE NOTICE 'DELETEd % row(s) FROM seat', row_count;
    END IF;
    RETURN NULL;
END;
$$;*/

/*CREATE TRIGGER InsteadDELETETrigger
    AFTER INSERT
    ON seat
    DELETE FROM seat WHERE status = false;
end*/

/*CREATE OR REPLACE PROCEDURE clean_seat() AS '
    DELETE FROM seat
    WHERE status = FALSE;
' LANGUAGE SQL;*/

/*CREATE TRIGGER manage_seat
    AFTER INSERT
    ON seat
    FOR EACH ROW
    EXECUTE PROCEDURE clean_seat();*/





/*I need to include some different values to this database bt it not possible to

/*

CREATE TABLE seats(
                      seat_id int PRIMARY KEY UNIQUE,
                      status BOOLEAN NOT NULL,
                      user_id int NOT NULL,
                      CONSTRAINT fk_id FOREIGN KEY(user_id) REFERENCES Users(id)
);*

  insert into seat (seat_no, status, user_id) values (5,false,1),(6,false,1),(7,false,1),(8,false,1),(9,false,1),
                                                   (10,false,1),(11,false,1),(12,false,1),(13,false,1),(14,false,1),
                                                   (15,false,1),(16,false,1),(17,false,1),(18,false,1),(19,false,1),(20,false,1),
                                                   (21,false,1),(22,false,1),(23,false,1),(24,false,1),(25,false,1),(26,false,1),
                                                   (27,false,1),(28,false,1),(29,false,1),(30,false,1),(31,false,1),(32,false,1),
                                                   (33,false,1),(34,false,1),(35,false,1),(36,false,1),(37,false,1),(38,false,1),
                                                   (39,false,1),(40,false,1),(41,false,1),(42,false,1),(43,false,1),(44,false,1),
                                                   (45,false,1),(46,false,1),(47,false,1),(48,false,1),(49,false,1),(50,false,1),(51,false,1),
                                                   (52,false,1),(53,false,1),(54,false,1),(55,false,1),(56,false,1),(57,false,1),(58,false,1),(59,false,1),
                                                   (60,false,1),(61,false,1),(62,false,1),(63,false,1),(64,false,1),(65,false,1),(66,false,1),(67,false,1),
                                                   (68,false,1),(69,false,1),(70,false,1),(71,false,1),(72,false,1),(73,false,1),(74,false,1),(75,false,1),(76,false,1),
                                                   (77,false,1),(78,false,1),(79,false,1),(80,false,1),(81,false,1),(82,false,1),(83,false,1),(84,false,1),(85,false,1),
                                                   (86,false,1),(87,false,1),(88,false,1);
 */
 */