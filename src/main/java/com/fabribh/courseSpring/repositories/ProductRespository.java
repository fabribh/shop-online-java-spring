package com.fabribh.courseSpring.repositories;

import com.fabribh.courseSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {

}
