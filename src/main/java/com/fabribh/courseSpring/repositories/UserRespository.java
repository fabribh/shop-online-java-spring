package com.fabribh.courseSpring.repositories;

import com.fabribh.courseSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {

}
