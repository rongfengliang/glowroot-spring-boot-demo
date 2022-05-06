create database demoapp;

use demoapp;
CREATE TABLE `apps` (
    `id` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO demoapp.apps (id) VALUES('111');
INSERT INTO demoapp.apps (id) VALUES('333');
