package com.fabribh.shopOnline.services;

import com.fabribh.shopOnline.entities.Category;
import com.fabribh.shopOnline.repositories.CategoryRespository;
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
