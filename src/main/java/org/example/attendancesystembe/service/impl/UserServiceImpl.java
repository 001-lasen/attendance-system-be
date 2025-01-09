package org.example.attendancesystembe.service.impl;

import org.example.attendancesystembe.domain.Student;
import org.example.attendancesystembe.domain.Teacher;
import org.example.attendancesystembe.domain.User;
import org.example.attendancesystembe.repository.StudentRepository;
import org.example.attendancesystembe.repository.TeacherRepository;
import org.example.attendancesystembe.repository.UserRepository;
import org.example.attendancesystembe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public User createUser(User user) {
        User createdUser = userRepository.save(user);
        if (user.getRole() == User.Role.TEACHER) {
            Teacher teacher = new Teacher();
            teacher.setName(user.getUsername());
            teacher.setUser(createdUser);
            teacherRepository.save(teacher);
        } else if (user.getRole() == User.Role.STUDENT) {
            Student student = new Student();
            student.setName(user.getUsername());
            student.setUser(createdUser);
            studentRepository.save(student);
        }
        return createdUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUsersBySearchKey(String searchKey) {
        return userRepository.findByUsernameContaining(searchKey);
    }
}