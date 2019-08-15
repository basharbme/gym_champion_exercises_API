package com.progresspoint.gym_champion_exercises.bootstrapdata;

import com.progresspoint.gym_champion_exercises.model.Exercise;
import com.progresspoint.gym_champion_exercises.model.enums.BodyPosition;
import com.progresspoint.gym_champion_exercises.model.enums.Equipment;
import com.progresspoint.gym_champion_exercises.model.enums.PushPullcheme;
import com.progresspoint.gym_champion_exercises.repository.BodyPartRepository;
import com.progresspoint.gym_champion_exercises.repository.ExerciseRepository;
import com.progresspoint.gym_champion_exercises.repository.MuscleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class GCExerciseBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final BodyPartRepository bodyPartRepository;
    private final ExerciseRepository exerciseRepository;
    private final MuscleRepository muscleRepository;

    public GCExerciseBootstrap(BodyPartRepository bodyPartRepository, ExerciseRepository exerciseRepository,
            MuscleRepository muscleRepository) {
        this.bodyPartRepository = bodyPartRepository;
        this.exerciseRepository = exerciseRepository;
        this.muscleRepository = muscleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.debug("Bootstraping project. DB data initialisation");
        exerciseRepository.saveAll(getExercises());
    }

    private List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<>();

        Exercise dumbbellBicepsCurlStanding = new Exercise();
        dumbbellBicepsCurlStanding.setEquipment(Equipment.DUMBBELL);
        dumbbellBicepsCurlStanding.setPushPullcheme(PushPullcheme.PULL);
        dumbbellBicepsCurlStanding.setBodyPosition(BodyPosition.HANGING);

        exercises.add(dumbbellBicepsCurlStanding);




        return exercises;
    }


}
