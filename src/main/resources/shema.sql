
/*CREATE TABLE IF NOT EXISTS Users(
    id int PRIMARY KEY UNIQUE,
    username varchar(255) check (length(username)> 5) not null ,
    password varchar(255) check ( length(password) > 8 ) not null ,
    phone_number varchar(10) not null
);
*/
CREATE TABLE IF NOT EXISTS seat(
    seat_id int primary key unique,
    status boolean not null,
    user_id int not null
);

/*CREATE OR REPLACE PROCEDURE clean_seat() AS '
    DELETE FROM seat
    WHERE status = FALSE;
' LANGUAGE SQL;*/

CREATE TRIGGER manage_seat
    AFTER INSERT
    ON seat
    FOR EACH ROW
EXECUTE PROCEDURE public.clean_seat();





/*I need to include some different values to this database bt it not possible to

/*

CREATE TABLE seats(
                      seat_id int PRIMARY KEY UNIQUE,
                      status BOOLEAN NOT NULL,
                      user_id int NOT NULL,
                      CONSTRAINT fk_id FOREIGN KEY(user_id) REFERENCES Users(id)
);*