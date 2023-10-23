package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.service.implementations.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping(value = "/movielist/addusers")
    public String addUser(@Valid @RequestBody List<Users> users){
        return userServiceImpl.addUsers(users);
    }
    @GetMapping(value = "/movielist/users")
    public List<Users> listAllUsers(){
        return userServiceImpl.listAllUsers();
    }
    @DeleteMapping(value = "movielist/deleteuser")
    public String deleteUser(@RequestParam int id){
        return userServiceImpl.deleteUser(id);
    }
    @PutMapping(value = "movielist/updateuser")
    public String updateUser(@RequestParam int id, @RequestBody Users users){
        return userServiceImpl.updateUser(id, users);
    }
}
