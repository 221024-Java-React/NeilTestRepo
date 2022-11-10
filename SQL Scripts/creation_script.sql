--use double dash to create single line comments

--ddl is used to create our db and user 
--dcl is used to grant access to our usr to db

--creating first user
create user rootuser with password 'password';

--create the new data base
create database schooldb;

--use dcl to give rootuser permission 
grant all privileges on database schooldb to rootuser;