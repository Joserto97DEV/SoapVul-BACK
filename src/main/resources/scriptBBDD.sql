create database soapvul;
use soapvul;
CREATE TABLE `SoapVul`.`Films` (
  `id` INT NOT NULL,
  `year` VARCHAR(45) NOT NULL,
  `director` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `SoapVul`.`Films` (id, year, director,title)
	VALUES ('1', '2021', 'Malcolm D. Lee', 'Space jam: a new legacy');

INSERT INTO `SoapVul`.`Films` (id, year, director,title)
	VALUES ('2', '2021', 'Jaume Collet-Serra', 'Jungle Cruise');

INSERT INTO `SoapVul`.`Films` (id, year, director,title)
	VALUES ('3', '2021', 'Santiago Segura', 'A Todo Tren');

INSERT INTO `SoapVul`.`Films` (id, year, director,title)
	VALUES ('4', '2021', 'Cate Shortland', 'Black Widow');

INSERT INTO `SoapVul`.`Films` (id, year, director,title)
	VALUES ('5', '2021', 'Everardo Gout', 'The Forever Purge');

INSERT INTO `SoapVul`.`Films` (id, year, director,title)
	VALUES ('6', '2021', 'M. Night Shyamalan', 'Old');
