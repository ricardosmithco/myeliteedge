package com.myeliteedge.myeliteedge.dao;

import com.myeliteedge.myeliteedge.beans.Credential;
import com.myeliteedge.myeliteedge.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate template;

    public User createUser(User user){
        User newUser = new User();
        Credential newCredential = new Credential();

        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setRecruiter(user.getRecruiter());

        newCredential.setUsername(user.getEmail());
        newCredential.setPassword(user.getCredential().getPassword());
        newUser.setCredential(newCredential);

        newUser.setCreatedOn(user.getCreatedOn());
        newUser.setActiveUntil(user.getActiveUntil());
        return newUser;
    }
}
