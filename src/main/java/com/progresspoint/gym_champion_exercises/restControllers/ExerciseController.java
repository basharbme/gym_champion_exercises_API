package com.progresspoint.gym_champion_exercises.restControllers;

import com.progresspoint.gym_champion_exercises.model.Exercise;
import com.progresspoint.gym_champion_exercises.services.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/v1/exercises")
@Slf4j
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public ResponseEntity<Set<Exercise>> getAllExercises(){
        Set<Exercise> exercises = exerciseService.findAll();
        if(exercises.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getExerciseByExerciseName(@PathVariable("name") String name){
        log.debug("Fetch exercise: " + name);
        Exercise exercise = exerciseService.findByName(name);
        if(exercise == null){
            log.debug("No exercise by name: " + name);
            return new ResponseEntity<>(new RuntimeException("Not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(exercise, HttpStatus.OK);
    }



}
