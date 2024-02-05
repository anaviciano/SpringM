package com.example.springm.repository;

import com.example.springm.model.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConstructorRepository extends JpaRepository<Constructor, Long> {

}
