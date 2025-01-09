package org.example.attendancesystembe.repository;

import org.example.attendancesystembe.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}