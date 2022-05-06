package com.dalong.metricsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@RestController
public class Api {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = {"/demo"})
    public  Object demo(){
        return jdbcTemplate.queryForList("select * from apps");
    }
    @GetMapping(value = {"/apicall"})
    public  Object apiCall(){
        ResponseEntity<String> responseEntity=    restTemplate.getForEntity("https://www.baidu.com",String.class);
        return  responseEntity.getBody();
    }
}
