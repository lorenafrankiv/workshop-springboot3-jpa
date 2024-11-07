package com.udemy.coursespring.repositories;

import com.udemy.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
