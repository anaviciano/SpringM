package com.example.springm.repository;

import com.example.springm.model.Circuit;
import com.example.springm.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RaceRepository extends JpaRepository<Race, Long> {
    Optional<Race> findByRound(int round);

    void deleteRaceByRaceId(Long raceId);
}
