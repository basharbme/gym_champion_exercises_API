package com.progresspoint.gym_champion_exercises.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = "exercises")
@Table(name = "muscle")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "id")
public class Muscle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "muscle_id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "muscles")

    private Set<Exercise> exercises = new HashSet<>();
}
