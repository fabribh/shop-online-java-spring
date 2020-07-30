package com.fabribh.courseSpring.services;

import com.fabribh.courseSpring.entities.Order;
import com.fabribh.courseSpring.repositories.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRespository respository;

    public List<Order> findAll() {
        return respository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = respository.findById(id);
        return order.get();
    }
}
