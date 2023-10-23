package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Roles;
import com.example.nawafotayf.movielist.entity.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {
    public String addUsers(List<Users> users);
    public List<Users> listAllUsers();
    public String deleteUser(int id);
    public String updateUser(int id, Users users);
}
