package com.fabribh.shopOnline.services;

import com.fabribh.shopOnline.entities.Product;
import com.fabribh.shopOnline.repositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRespository respository;

    public List<Product> findAll() {
        return respository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = respository.findById(id);
        return product.get();
    }
}
