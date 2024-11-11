package com.udemy.coursespring.services;

import com.udemy.coursespring.entities.Category;
import com.udemy.coursespring.entities.Product;
import com.udemy.coursespring.repositories.CategoryRepository;
import com.udemy.coursespring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
