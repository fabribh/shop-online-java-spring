package com.fabribh.courseSpring.resources;

import com.fabribh.courseSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Fabio", "si.fabioribeiro@gmail.com", "31-997765285", "12345");
        return ResponseEntity.ok().body(u);
    }
}
