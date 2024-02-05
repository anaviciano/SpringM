package com.example.springm.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "constructors")
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "constructorid")
    private Long id;

    @Column(unique = true, nullable = false)
    private String constructorref;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String nationality;

    private String url;

    @OneToMany(mappedBy = "constructor", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Driver> listaDrivers;
}
