package com.progresspoint.gym_champion_exercises.repository;

import com.progresspoint.gym_champion_exercises.model.Exercise;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

    Exercise findByName(String name);
}
