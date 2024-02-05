package com.example.springm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "raceid")
    private Long raceId;

    private int year;
    private int round;

    private String name;
    private LocalDate date;
    private LocalTime time;
    private String url;


    //@JsonManagedReference
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "circuitid")
    //si no ponemos esta etiqueta, tendremos un bucle infinito
    @JsonIgnoreProperties("race")
    private Circuit circuit;
}