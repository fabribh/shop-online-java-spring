package com.fabribh.courseSpring.services;

import com.fabribh.courseSpring.entities.Category;
import com.fabribh.courseSpring.entities.User;
import com.fabribh.courseSpring.repositories.CategoryRespository;
import com.fabribh.courseSpring.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRespository respository;

    public List<Category> findAll() {
        return respository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = respository.findById(id);
        return category.get();
    }
}
