package org.example.attendancesystembe.service;

import org.example.attendancesystembe.domain.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    public List<User> getAllUsers();
}
