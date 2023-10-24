package com.example.nawafotayf.movielist.service.implementations;

import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.repository.UsersRepository;
import com.example.nawafotayf.movielist.service.interfaces.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;
    @Override
    public void addUsers(List<Users> users) {
        usersRepository.saveAll(users);
    }

    @Override
    public List<Users> listAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteUser(String name) {
        Users users = usersRepository.findByusername(name);
        usersRepository.delete(users);
    }
    @Override
    public void updateUser(String name, Users users) {
        Users findUsers = usersRepository.findByusername(name);
        if(users.getUsername() != null){
            findUsers.setUsername(users.getUsername());
        }
        if(users.getPassword() !=null){
            findUsers.setPassword(users.getPassword());
        }
        if(users.getDob() != null){
            findUsers.setDob(users.getDob());
        }
        usersRepository.save(findUsers);
    }

}

