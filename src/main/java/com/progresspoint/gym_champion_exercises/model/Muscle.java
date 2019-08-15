package com.progresspoint.gym_champion_exercises.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Muscle {

    private Long id;

    private String name;
}
