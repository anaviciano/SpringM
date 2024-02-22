package com.example.springm.repository;

import com.example.springm.model.Circuit;
import com.example.springm.model.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface CircuitRepository extends JpaRepository<Circuit, Long> {
    Optional<Circuit> findByCircuitRefIgnoreCase(String circuitRef);

    @Transactional
    void deleteByCircuitRef(String circuitRef);
}
