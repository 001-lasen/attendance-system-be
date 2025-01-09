package org.example.attendancesystembe.repository;

import org.example.attendancesystembe.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}