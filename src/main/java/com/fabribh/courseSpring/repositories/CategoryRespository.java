package com.fabribh.courseSpring.repositories;

import com.fabribh.courseSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
