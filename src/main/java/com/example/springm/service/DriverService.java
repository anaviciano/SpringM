package com.example.springm.service;

import com.example.springm.model.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<Driver> getAllDrivers();
    Optional<Driver> getDriverByCode(String code);

    // Método para guardar un driver
    void saveDriver(Driver driver);

    // Método para eliminar un driver por su código
    void deleteDriver(String code);
}

