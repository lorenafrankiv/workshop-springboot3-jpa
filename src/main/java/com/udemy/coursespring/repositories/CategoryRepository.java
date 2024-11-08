package com.udemy.coursespring.repositories;

import com.udemy.coursespring.entities.Category;
import com.udemy.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
