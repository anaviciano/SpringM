package com.example.springm.service;

import com.example.springm.model.Circuit;
import com.example.springm.model.Race;
import com.example.springm.repository.RaceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public RaceServiceImpl(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    @Override
    @Transactional
    public void saveRace(Race race) {
        if (race.getCircuit() != null) {
            if (race.getCircuit().getCircuitid() != null) {
                race.setCircuit(entityManager.merge(race.getCircuit()));
            } else {
                raceRepository.save(race);
                race.getCircuit().setRace(race);
                entityManager.persist(race.getCircuit());
            }
        } else {
            raceRepository.save(race);
        }
    }
    @Override
    public void deleteRaceByRaceId(Long id) {
        raceRepository.deleteRaceByRaceId(id);
    }

    @Override
    public Optional<Race> getRaceByRound(int round) {
        return raceRepository.findByRound(round);
    }

}
