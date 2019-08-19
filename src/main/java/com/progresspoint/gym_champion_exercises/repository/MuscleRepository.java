package com.progresspoint.gym_champion_exercises.repository;

import com.progresspoint.gym_champion_exercises.model.Muscle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MuscleRepository extends CrudRepository<Muscle, Long> {

    Optional<Muscle> findByName(String name);
}
