
USE lab5;


CREATE TABLE 'persons' (
  'id' INT NOT NULL AUTO_INCREMENT,
  'firstName' VARCHAR(45) NOT NULL,
  'secondName' VARCHAR(45) NOT NULL,
  'age' INT  NOT NULL,
  PRIMARY KEY ('id'))ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;