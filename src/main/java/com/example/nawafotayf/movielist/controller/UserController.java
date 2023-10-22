package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.service.implementations.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping(value = "/movielist/addusers")
    public String addUser(@Valid @RequestBody List<Users> users){
        return userServiceImpl.addUsers(users);
    }
}
