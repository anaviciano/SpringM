package com.example.springm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMApplication.class, args);
    }

}
/*
    spring.datasource.url=jdbc:postgresql://ejer7.cjyu6ymy4p25.us-east-1.rds.amazonaws.com/f12006
spring.datasource.username=postgres
spring.datasource.password=12345678
spring.jpa.show-sql=true

spring.datasource.url=jdbc:postgresql://localhost:5432/f12006?useSSL=false
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
logging.level.org.hibernate.SQL=debug

     */