CREATE DATABASE IF NOT EXISTS `attendance_database`;

USE `attendance_database`;

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       role ENUM('TEACHER', 'STUDENT') NOT NULL
);

CREATE TABLE teachers (
                          employee_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          user_id INT NOT NULL,
                          FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE students (
                          student_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          user_id INT NOT NULL,
                          FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE courses (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         course_name VARCHAR(100) NOT NULL,
                         teacher_id INT NOT NULL,
                         FOREIGN KEY (teacher_id) REFERENCES teachers(employee_id) ON DELETE CASCADE
);

CREATE TABLE student_courses (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 student_id INT NOT NULL,
                                 course_id INT NOT NULL,
                                 FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
                                 FOREIGN KEY (course_id) REFERENCES courses(id) ON DELETE CASCADE,
                                 UNIQUE (student_id, course_id)
);

CREATE TABLE attendance (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            student_id INT NOT NULL,
                            course_id INT NOT NULL,
                            date DATE NOT NULL,
                            status ENUM('PRESENT', 'ABSENT') NOT NULL,
                            FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
                            FOREIGN KEY (course_id) REFERENCES courses(id) ON DELETE CASCADE
);