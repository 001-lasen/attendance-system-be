CREATE DATABASE IF NOT EXISTS `attendance-database`;

USE `attendance-database`;

CREATE TABLE `user_table` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);