package com.example.springm;

import com.example.springm.model.Driver;
import com.example.springm.repository.DriverRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

/*
BBDD -> JDBC -> Hibernate -> Spring Data JPA
 */
@SpringBootApplication
public class SpringMApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMApplication.class, args);

        /*
        //VIDEO ALAN INTRODUCCIÓN SPRING JPA
        ApplicationContext context = SpringApplication.run(SpringMApplication.class, args);
        //var consctructorRepos = context.getBean(ConstructorRepository.class);
        var driverRepos = context.getBean(DriverRepository.class);
        System.out.println("dentro");
        //Constructor constructor1 = new Constructor(2, "constructor1", "nameCo", "nationalityCo", "urlCo");
        Driver driver1 = new Driver(null, "codeDD", "forenameD", "surnameD", LocalDate.now(), "nationalityD", "urlD");
        //Race race = new Race(4, 1990, 4, circuit, "nameR", "dateR", "timeR", "urlR");
        System.out.println("new Driver");
        //consctructorRepos.save(constructor1);
        System.out.println("new constructor");
        //driverRepos.save(driver1);
        System.out.println("guardado");
        driverRepos.findAllByForename("Ana").forEach(System.out::println);
        System.out.println("fin");

         */
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