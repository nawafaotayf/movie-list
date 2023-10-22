package com.example.nawafotayf.movielist.repository;

import com.example.nawafotayf.movielist.entity.Roles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RolesRepositoryTest {
    @Autowired
    private RolesRepository rolesRepository;
    @Test
    public void addRoles(){
        Roles roles = new Roles("admin");
        Roles role = new Roles("user");
        rolesRepository.save(role);
        rolesRepository.save(roles);
    }
}