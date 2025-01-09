package org.example.attendancesystembe.controller;

import org.example.attendancesystembe.domain.User;
import org.example.attendancesystembe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            User createdUser = userService.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getUser")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String searchKey) {
        List<User> users;
        if (searchKey != null) {
            users = userService.getUsersBySearchKey(searchKey);
        } else {
            users = userService.getAllUsers();
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}