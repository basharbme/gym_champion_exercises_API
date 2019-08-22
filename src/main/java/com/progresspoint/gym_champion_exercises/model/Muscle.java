package com.progresspoint.gym_champion_exercises.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = "exercises")
@Table(name = "muscle")
public class Muscle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "muscle_id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "muscles")
    private Set<Exercise> exercises;
}
