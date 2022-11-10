-- look at some more ddl example


--creating a new table 
create table people(
id int primary key,
type int,
first_name varchar(64),
last_name varchar(64),
email varchar(256),
password varchar(256)
);

-- use dml to CRUD elements in table
--Insert
insert into people(id, type, first_name, last_name, email, "password") values 
(1, 1, 'Valerie', 'Frizzle', 'V.Friz@email.com', 'badpass');
--if you are insert all values you dont need to list out the columns
insert into people values
(2, 1,'Veronica', 'Vaughn', 'V.Vaughn@email.com', 'badpa55');
--get info from table
select * from people;