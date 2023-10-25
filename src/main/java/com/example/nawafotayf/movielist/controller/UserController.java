package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.service.implementations.UserServiceImpl;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movielist/user")
@NoArgsConstructor
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping(value = "/movielist/users/addusers")
    public ResponseEntity<String> addUser(@Valid @RequestBody List<Users> users) {
        try{
        userServiceImpl.addUsers(users);
        String message = "user added successfully";
        return ResponseEntity.status(
                HttpStatus.CREATED).body(message);
        }
        catch (Exception e){
            String message = "user not added\n" + e.getMessage();
            return ResponseEntity.badRequest().body(message);
        }
    }

    @GetMapping(value = "/movielist/users")
    public List<Users> listAllUsers() {
        return userServiceImpl.listAllUsers();
    }
    @DeleteMapping(value = "movielist/users/deleteuser")
    public ResponseEntity<String> deleteUser(@RequestParam String name) {
        try {
            userServiceImpl.deleteUser(name);
            String message = "user deleted";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
        catch (Exception e){
            String message = "user not deleted\n" + e.getMessage();
            return ResponseEntity.badRequest().body(message);
        }
    }

    @PutMapping(value = "movielist/users/updateuser")
    public ResponseEntity<String> updateUser(@RequestParam String name, @RequestBody Users users) {
        try{
            userServiceImpl.updateUser(name, users);
            String message = "user updated";
            return ResponseEntity.status(HttpStatus.OK).body(message);
    }
        catch (Exception e){
            String message = "user not updated\n" + e.getMessage();
            return ResponseEntity.badRequest().body(message);
        }
}
}
