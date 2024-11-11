package com.udemy.coursespring.repositories;

import com.udemy.coursespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
