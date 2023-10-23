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
    public String addUsers(List<Users> users) {
        usersRepository.saveAll(users);
        return "Users adding successfully";
    }

    @Override
    public List<Users> listAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public String deleteUser(int id) {
        usersRepository.deleteById(id);
        return "User deleted successfully";
    }

    @Override
    public String updateUser(int id, Users users) {
        Users findUsers = usersRepository.findById(id).get();
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
        return "user updated successfully";
    }

}

