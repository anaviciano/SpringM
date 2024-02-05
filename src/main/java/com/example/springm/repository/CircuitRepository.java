package com.example.springm.repository;

import com.example.springm.model.Circuit;
import com.example.springm.model.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CircuitRepository extends JpaRepository<Circuit, Long> {
    Optional<Circuit> findByCircuitRefIgnoreCase(String circuitRef);

    void deleteByCircuitRef(String circuitRef);
}
