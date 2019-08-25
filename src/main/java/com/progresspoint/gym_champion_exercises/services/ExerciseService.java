package com.progresspoint.gym_champion_exercises.services;

import com.progresspoint.gym_champion_exercises.model.Exercise;

public interface ExerciseService extends CrudService<Exercise, Long> {

    Exercise findByBodyPartName(String bodyPartName);
}
