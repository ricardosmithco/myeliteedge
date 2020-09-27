package com.myeliteedge.myeliteedge.dao;

import com.myeliteedge.myeliteedge.beans.Credential;
import com.myeliteedge.myeliteedge.beans.User;
import com.myeliteedge.myeliteedge.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

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

        newCredential.setEmail(user.getEmail());
        newCredential.setPassword(user.getCredential().getPassword());
        newUser.setCredential(newCredential);

        newUser.setCreatedOn(user.getCreatedOn());
        newUser.setActiveUntil(user.getActiveUntil());
        return newUser;
    }

    public void registerCredentialInfo(Credential credential){
        template.update(Constants.INSERT_A_CREDENTIAL,credential.getEmail(),credential.getPassword());
    }

    public void registerUserInfo(User user){
        template.update(Constants.INSERT_A_USER,user.getFirstName(),user.getLastName(),user.getCredential().getEmail(),user.getRecruiter(),user.getCreatedOn(),user.getActiveUntil());
    }

    public User returnCreatedUser(String email){
        return template.queryForObject(Constants.RETURN_USER, new Object[]{email}, (rs, rowNum) ->
            new User(rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Email"),
                    rs.getTimestamp("Created"),
                    rs.getTimestamp("ActiveUntil"),
                    rs.getBoolean("Recruiter")
        ));
    }

    //return true if email is available or false if email already in use
    public boolean isValidEmail(String email){
        return template.queryForObject(Constants.RETURN_USER_COUNT, new Object[]{email}, Integer.class) == 0;
    }
}
