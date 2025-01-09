package org.example.attendancesystembe.service.impl;

import org.example.attendancesystembe.domain.User;
import org.example.attendancesystembe.repository.UserRepository;
import org.example.attendancesystembe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> getUsersBySearchKey(String searchKey) {
        return userRepository.findByUsernameContaining(searchKey);
    }
}