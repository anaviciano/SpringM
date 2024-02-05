package com.example.springm.service;

import com.example.springm.model.Circuit;
import com.example.springm.repository.CircuitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircuitServiceImpl implements CircuitService{
    private final CircuitRepository circuitRepository;

    @Autowired
    public CircuitServiceImpl(CircuitRepository circuitRepository) {
        this.circuitRepository = circuitRepository;
    }


    @Override
    public List<Circuit> getAllCircuits() {
        return circuitRepository.findAll();
    }

    @Override
    public Optional<Circuit> getCircuitByCircuitref(String circuitref) {
        return circuitRepository.findByCircuitRefIgnoreCase(circuitref);
    }

    @Override
    public void saveCircuit(Circuit circuit) {
        circuitRepository.save(circuit);
    }

    @Override
    public void deleteCircuitByCircuitref(String circuitref) {
        circuitRepository.deleteByCircuitRef(circuitref);
    }
}
