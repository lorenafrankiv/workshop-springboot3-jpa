package com.udemy.coursespring.services;

import com.udemy.coursespring.entities.User;
import com.udemy.coursespring.repositories.UserRepository;
import com.udemy.coursespring.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
            repository.deleteById(id);
    }

    public User update(Long id, User obj) {
        try {User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
        }
        catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
