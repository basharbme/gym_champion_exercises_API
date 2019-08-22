package com.progresspoint.gym_champion_exercises.services.servicesJPAImpl;

import com.progresspoint.gym_champion_exercises.model.Exercise;
import com.progresspoint.gym_champion_exercises.repository.ExerciseRepository;
import com.progresspoint.gym_champion_exercises.services.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExerciseServiceJPAImpl implements ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseServiceJPAImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public Exercise findByBodyPartName(String bodyPartName) {
        return null;
    }

    @Override
    public Set<Exercise> findAll() {
        Set<Exercise> exercises = new HashSet<>();
        exerciseRepository.findAll().iterator().forEachRemaining(exercises::add);
        return exercises;
    }

    @Override
    public Exercise findById(Long aLong) {
        return null;
    }

    @Override
    public Exercise findByName(String name) {
        return exerciseRepository.findByName(name);
    }
}
