package com.udemy.coursespring.repositories;

import com.udemy.coursespring.entities.OrderItem;
import com.udemy.coursespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
