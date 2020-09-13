package com.myeliteedge.myeliteedge.service;

import com.myeliteedge.myeliteedge.beans.Customer;
import com.myeliteedge.myeliteedge.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    public CustomerRepository repository;

    public List<Customer> getCustomers(){
        return this.repository.getCustomers();
    }
}
