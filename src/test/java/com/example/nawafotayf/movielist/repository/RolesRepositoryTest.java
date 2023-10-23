package com.example.nawafotayf.movielist.repository;

import com.example.nawafotayf.movielist.entity.Roles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RolesRepositoryTest {
    @Autowired
    RolesRepository rolesRepository;
    @Test
    public void addRoles(){
        Roles roles = new Roles("admin");
        rolesRepository.save(roles);
    }
}