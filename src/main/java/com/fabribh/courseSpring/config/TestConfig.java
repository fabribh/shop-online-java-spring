package com.fabribh.courseSpring.config;

import com.fabribh.courseSpring.entities.User;
import com.fabribh.courseSpring.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRespository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
