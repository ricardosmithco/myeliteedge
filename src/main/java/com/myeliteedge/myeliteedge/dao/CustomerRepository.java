package com.myeliteedge.myeliteedge.dao;

import com.myeliteedge.myeliteedge.beans.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository {

    @Autowired
    JdbcTemplate template;

    public List<Customer> getCustomers(){
        String sql = "select * from CUSTOMERS";
        List<Map<String, Object>> list = template.queryForList(sql);
        List<Customer> customers = new ArrayList<>();

        for(Map<String, Object> map : list){
            Customer customer = new Customer();
            customer.setId( (Integer) map.get("id"));
            customer.setName( (String) map.get("name"));
            customers.add(customer);
        }

        return customers;
    }
}
