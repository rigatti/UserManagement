package net.rigatti.admin.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {

    @Autowired
    UserRepository userRepository;
    public String get() {
        return userRepository.findAll().toString();
    }

    public void init() {
        String a = "a";
    }
}
