package com.myeliteedge.myeliteedge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class MyeliteedgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeliteedgeApplication.class, args);
	}

}
@Component
@RequiredArgsConstructor
class SqlServerDemo {

	private final JdbcTemplate template;

	@EventListener(ApplicationReadyEvent.class)
	public void ready(){
		List<Customer> customers = this.template.query("select * from CUSTOMERS",
				(resultSet, i) -> new Customer(resultSet.getInt("id"), resultSet.getString("name")));
		customers.forEach(customer ->System.out.println(customer));
	}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Customer{
	private Integer id;
	private String name;


}
