package com.example.springm.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "circuits")
public class Circuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "circuitid")
    private Long circuitid;
    @Column(unique = true, nullable = false, name = "circuitref")
    private String circuitRef;
    @Column(nullable = false, name = "name")
    private String name;
    @Column(nullable = false, name = "location")
    private String location;
    @Column(nullable = false, name = "country")
    private String country;
    private Double lat;
    private Double lng;
    private int alt;
    private String url;

    //@JsonBackReference
    @OneToOne(mappedBy = "circuit", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    //@JsonIgnoreProperties("circuit")
    private Race race;

}
