package com.myeliteedge.myeliteedge;

import com.myeliteedge.pojos.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController(value = "/")
@EnableAutoConfiguration
public class DemoClass {

    @Autowired
    JdbcTemplate template;

    @RequestMapping(value = "allCustomers")
    public List<Customer> getAllCustomers(){
        String sql = "select * from CUSTOMERS";
        List<Map<String, Object>> list = template.queryForList(sql);
        List<Customer> customers = new ArrayList<Customer>();

        for(Map<String, Object> map : list){
            Customer customer = new Customer();
            customer.setId( (Integer) map.get("id"));
            customer.setName( (String) map.get("name"));
            customers.add(customer);
        }

        return customers;
    }


}
