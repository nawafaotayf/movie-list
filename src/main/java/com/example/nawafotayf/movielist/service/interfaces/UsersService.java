package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {
    public String addUsers(List<Users> users);
}
