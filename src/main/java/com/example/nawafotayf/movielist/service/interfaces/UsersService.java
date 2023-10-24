package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Roles;
import com.example.nawafotayf.movielist.entity.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {
    public void addUsers(List<Users> users);
    public List<Users> listAllUsers();
    public void deleteUser(String name);
    public void updateUser(String name, Users users);
}
