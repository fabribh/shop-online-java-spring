package com.fabribh.shopOnline.repositories;

import com.fabribh.shopOnline.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {

}
