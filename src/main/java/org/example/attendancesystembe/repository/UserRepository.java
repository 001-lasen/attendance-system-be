package org.example.attendancesystembe.repository;

import org.example.attendancesystembe.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByNameContaining(String searchKey);
}