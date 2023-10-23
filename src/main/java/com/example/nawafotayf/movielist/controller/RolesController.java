package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Roles;
import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.service.implementations.RolesServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolesController {
    @Autowired
    private RolesServiceImpl rolesServiceImpl;

    @PostMapping(value = "/movielist/addroles")
    public String addRoles(@Valid @RequestBody List<Roles> users) {
        return rolesServiceImpl.addRoles(users);
    }
}
