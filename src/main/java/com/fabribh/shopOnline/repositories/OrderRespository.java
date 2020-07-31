package com.fabribh.shopOnline.repositories;

import com.fabribh.shopOnline.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Long> {

}
