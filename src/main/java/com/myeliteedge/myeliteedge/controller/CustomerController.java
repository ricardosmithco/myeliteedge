package com.myeliteedge.myeliteedge.controller;

import com.myeliteedge.myeliteedge.beans.Customer;
import com.myeliteedge.myeliteedge.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @RequestMapping(value="/allCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getCustomers();
    }


}
