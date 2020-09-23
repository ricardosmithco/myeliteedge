package com.myeliteedge.myeliteedge.service;

import com.myeliteedge.myeliteedge.beans.User;
import com.myeliteedge.myeliteedge.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User createUser(User user){
        return repository.createUser(user);
    }

    public boolean isUsernameValid(String username){
        return repository.isUsernameValid(username);
    }
}
