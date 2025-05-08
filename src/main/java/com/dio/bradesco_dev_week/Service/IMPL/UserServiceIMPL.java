package com.dio.bradesco_dev_week.Service.IMPL;

import com.dio.bradesco_dev_week.Domain.Entity.User;
import com.dio.bradesco_dev_week.Domain.Repository.UserRepository;
import com.dio.bradesco_dev_week.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userCreate) {
        if(userRepository.existsByAccountNumber(userCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number already exists");
        }
        return userRepository.save(userCreate);
    }
}
