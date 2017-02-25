package net.rigatti.admin.provider;

import net.rigatti.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserProvider {

    @Autowired
    private UserRepository userRepository;

    public String getAll() {
        return userRepository.findAll().toString();
    }

}
