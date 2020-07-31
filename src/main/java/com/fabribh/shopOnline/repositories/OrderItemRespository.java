package com.fabribh.shopOnline.repositories;

import com.fabribh.shopOnline.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRespository extends JpaRepository<OrderItem, Long> {

}
