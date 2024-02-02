package com.example.springm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driverid")
    private Long id;

    @Column(unique=true)
    private String code;

    private String forename;
    private String surname;

    @JsonProperty("dateOfBirth")
    private LocalDate dob;

    private String nationality;
    private String url;

    /*
    //Video Alan Introdución Spring JPA
    public Driver(Long id, String code, String forename, String surname, LocalDate dob, String nationality, String url) {
        this.id = id;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
    }

    public Driver() {
    }

     */
}



