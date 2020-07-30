package com.fabribh.courseSpring.repositories;

import com.fabribh.courseSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Long> {

}
