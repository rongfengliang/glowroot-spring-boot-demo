package com.dalong.metricsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class MetricsdemoApplication {


	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return  new JdbcTemplate(dataSource);
	}

	@Bean
	public RestTemplate restTemplate(){
		 return  new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MetricsdemoApplication.class, args);
	}

}
