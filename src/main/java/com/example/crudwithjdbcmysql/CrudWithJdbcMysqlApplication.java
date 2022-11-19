package com.example.crudwithjdbcmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CrudWithJdbcMysqlApplication {


//    @Bean
//    public JdbcTemplate getJdbc(){
//        return new JdbcTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(CrudWithJdbcMysqlApplication.class, args);
    }



}
