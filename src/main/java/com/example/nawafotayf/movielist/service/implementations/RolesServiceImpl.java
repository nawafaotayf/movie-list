package com.example.nawafotayf.movielist.service.implementations;

import com.example.nawafotayf.movielist.entity.Roles;
import com.example.nawafotayf.movielist.repository.RolesRepository;
import com.example.nawafotayf.movielist.service.interfaces.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    RolesRepository rolesRepository;
    @Override
    public String addRoles(List<Roles> roles) {
        rolesRepository.saveAll(roles);
        return "Roles added";
    }
}
