package com.progresspoint.gym_champion_exercises.repository;

import com.progresspoint.gym_champion_exercises.model.BodyPart;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BodyPartRepository extends CrudRepository<BodyPart, Long> {

    Optional<BodyPart> findByName(String name);
}
