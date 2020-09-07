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
import com.myeliteedge.pojos.Customer;

@SpringBootApplication
public class MyeliteedgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeliteedgeApplication.class, args);
	}

}


