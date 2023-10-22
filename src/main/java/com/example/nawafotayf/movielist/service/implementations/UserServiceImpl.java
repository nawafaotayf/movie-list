package com.example.nawafotayf.movielist.service.implementations;

import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.repository.UsersRepository;
import com.example.nawafotayf.movielist.service.interfaces.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;
    @Override
    public String addUsers(List<Users> users) {
        usersRepository.saveAll(users);
        return "Users adding successfully";
    }
}
