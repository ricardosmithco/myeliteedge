package com.myeliteedge.myeliteedge.controller;

import com.myeliteedge.myeliteedge.beans.User;
import com.myeliteedge.myeliteedge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping(value="/createUser", method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @RequestMapping(value="/isValidEmail/{email}", method = RequestMethod.GET)
    public boolean isValidEmail(@PathVariable String email){ return service.isValidEmail(email);}
}
