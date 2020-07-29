package com.fabribh.courseSpring.services;

import com.fabribh.courseSpring.entities.User;
import com.fabribh.courseSpring.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRespository respository;

    public List<User> findAll() {
        return respository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = respository.findById(id);
        return user.get();
    }
}
