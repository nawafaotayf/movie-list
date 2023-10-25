package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UsersService {
    public void addUsers(List<Users> users);
    public List<Users> listAllUsers();
    public void deleteUser(String name);
    public void updateUser(String name, Users users);
    public UserDetailsService userDetailsService();
}
