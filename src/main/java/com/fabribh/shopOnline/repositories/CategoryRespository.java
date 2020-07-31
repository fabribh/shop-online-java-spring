package com.fabribh.shopOnline.repositories;

import com.fabribh.shopOnline.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
