package com.fabribh.courseSpring.config;

import com.fabribh.courseSpring.entities.Order;
import com.fabribh.courseSpring.entities.User;
import com.fabribh.courseSpring.entities.enums.OrderStatus;
import com.fabribh.courseSpring.repositories.OrderRespository;
import com.fabribh.courseSpring.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRespository userRepository;

    @Autowired
    private OrderRespository orderRespository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777777", "123456");

        Order o1 = new Order(null, Instant.parse("2020-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2020-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2020-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRespository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
