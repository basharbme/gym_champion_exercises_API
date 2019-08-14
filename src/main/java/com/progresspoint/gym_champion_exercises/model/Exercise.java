package com.progresspoint.gym_champion_exercises.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Exercise {

    private Long id;

    private String name;

    private String description;

}
