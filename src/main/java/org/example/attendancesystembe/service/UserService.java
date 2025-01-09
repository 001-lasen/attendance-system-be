package org.example.attendancesystembe.service;

import org.example.attendancesystembe.domain.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    List<User> getUsersBySearchKey(String searchKey);
}