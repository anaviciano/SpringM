package com.example.springm.repository;

import com.example.springm.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    //Optional<Driver> findDriverByCodeIgnoreCase(String code);
    Optional<Driver> findByCodeIgnoreCase(String code);
    // Método para eliminar un driver por su código
    @Transactional
    void deleteByCode(String code);
}

