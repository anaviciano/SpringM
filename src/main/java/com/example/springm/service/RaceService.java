package com.example.springm.service;

import com.example.springm.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    List<Race> getAllRaces();

    void saveRace(Race race);

    Optional<Race> getRaceByRound(int round);

    void deleteRaceByRaceId(Long id);




}
