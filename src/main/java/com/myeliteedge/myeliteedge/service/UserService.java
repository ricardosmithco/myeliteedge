package com.myeliteedge.myeliteedge.service;

import com.myeliteedge.myeliteedge.beans.User;
import com.myeliteedge.myeliteedge.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Transactional
    public User createUser(User user){
        repository.registerCredentialInfo(user.getCredential());
        repository.registerUserInfo(user);
        return repository.returnCreatedUser(user.getEmail());
    }

    public boolean isValidEmail(String username){
        return repository.isValidEmail(username);
    }
}
