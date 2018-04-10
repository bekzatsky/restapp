CREATE DATABASE IF NOT EXISTS user CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE TABLE user.users(
  id int(10) not null auto_increment primary key,
  first_name varchar(20) not null,
  last_name varchar(50) not null,
  age int(15) not null);
INSERT INTO user.users (id,first_name,last_name,age) VALUES
  (1,'Bekzat','Minazhatov',25),
  (2,'Azamat','Aitken',25),
  (3,'Nauryzkhan','Moldabay',26),
  (4,'Sarsembekov','Assylkhan',25);