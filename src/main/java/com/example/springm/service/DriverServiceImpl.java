package com.example.springm.service;

import com.example.springm.model.Driver;
import com.example.springm.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class DriverServiceImpl implements DriverService{
    private final DriverRepository repository;

    //no es necesario poner el @Autowired.
    @Autowired
    public DriverServiceImpl(DriverRepository repository){
        this.repository=repository;
    }

    @Override
    public List<Driver> getAllDrivers(){
        return repository.findAll();
    }

    @Override
    public Optional<Driver> getDriverByCode (String code){
        return repository.findByCodeIgnoreCase(code);
    }
    // Método para guardar un driver (tanto para crear como para actualizar)
    @Override
    public void saveDriver(Driver driver) {
        repository.save(driver);
    }

    // Método para eliminar un driver por su código
    @Override
    public void deleteDriver(String code) {
        repository.deleteByCode(code);
    }

}

