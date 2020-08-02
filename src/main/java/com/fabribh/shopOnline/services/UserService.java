package com.fabribh.shopOnline.services;

import com.fabribh.shopOnline.entities.User;
import com.fabribh.shopOnline.repositories.UserRespository;
import com.fabribh.shopOnline.services.exceptions.ResourceNotFoundException;
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
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return respository.save(obj);
    }

    public void delete(Long id) {
        respository.deleteById(id);
    }

    public User update(Long id, User obj) {
        User entity = respository.getOne(id);
        updateData(entity, obj);
        return respository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
