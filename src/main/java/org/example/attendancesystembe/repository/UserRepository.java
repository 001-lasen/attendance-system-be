package org.example.attendancesystembe.repository;

import org.example.attendancesystembe.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
