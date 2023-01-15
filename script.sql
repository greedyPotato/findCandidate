show databases

create database candidateFinder

use candidateFinder




select * from skills

select * from candidates

select * from titles

select * from candidates_skills

drop table candidates_skills
drop table titles
drop table candidates
drop table skills


CREATE TABLE skills (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO skills (name) VALUES ('java'),('c++'),('react'),('php'),('word'),('powerpoint'),('excel'),('angular'),('ruby'),('go'),('java script'),('sql');

CREATE TABLE titles (
id INT NOT NULL AUTO_INCREMENT,
title VARCHAR(255) NOT NULL,
category INT NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO titles (title, category) VALUES ("web developer", 2),("software engineer", 1),("software developer", 1),("react developer", 2),("frontend", 2),("data engineer", 3),
("big data developer", 3),("hr", 4),("architect", 5),("java developer", 1),("c++ developer", 1),("mobile developer", 2),("team lead", 6),("manager", 6);

CREATE TABLE candidates (
id INT NOT NULL AUTO_INCREMENT,
experience INT NOT NULL,
title VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO candidates (experience, title) VALUES (2, "web developer"),(2, "react developer"),(3, "java developer"),(4, "software developer"),(2, "hr"),(0, "hr")
,(1, "big date developer"),(6, "manager"),(1, "data engineer")
,(5, "team lead"),(7, "manager"),(2, "c++ developer"),(5, "architect"),(5, "hr"),(0, "react developer"),(5, "frotend");


create table candidates_skills(
candidate_id int,
skill_id int,
foreign key(candidate_id)
references candidates(id),
foreign key(skill_id)
references skills(id)
);

INSERT INTO candidates_skills (candidate_id, skill_id) VALUES (1, 1),(1,2),(2, 3),(2,8),(3, 1),(4,1),(4, 2),(4,12),(5, 5),(5,6),(6, 5),(7,1),(8, 2),(8,3),(8, 4),(8,9),
(9, 11),(10,7),(10, 9),(10,11),(10, 12),(11,2),(12, 1),(12,2),(12, 9),(12,8),(13, 1),(14,2),(15, 1),(15,2),(16, 10),(16,2);


