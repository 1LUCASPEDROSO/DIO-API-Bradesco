package com.dio.bradesco_dev_week.Controller;

import com.dio.bradesco_dev_week.Domain.Entity.User;
import com.dio.bradesco_dev_week.Service.IMPL.UserServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
   private  UserServiceIMPL userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
       User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userCreate){
        User userCreated = userService.create(userCreate);
        return ResponseEntity.status(201).body(userCreated);
    }
    }

