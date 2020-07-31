package com.fabribh.shopOnline.repositories;

import com.fabribh.shopOnline.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {

}
