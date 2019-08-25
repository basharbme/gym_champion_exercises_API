package com.progresspoint.gym_champion_exercises.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.progresspoint.gym_champion_exercises.model.enums.BodyPosition;
import com.progresspoint.gym_champion_exercises.model.enums.Equipment;
import com.progresspoint.gym_champion_exercises.model.enums.PushPullcheme;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"bodyParts", "muscles"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Equipment equipment;

    @Enumerated(value = EnumType.STRING)
    private BodyPosition bodyPosition;

    @Enumerated(value = EnumType.STRING)
    private PushPullcheme pushPullcheme;

    @ManyToMany
    @JoinTable(name = "exercise_bp",
    joinColumns = @JoinColumn(name = "exercise_id"),
    inverseJoinColumns = @JoinColumn(name = "body_part_id"))
    private Set<BodyPart> bodyParts = new HashSet<>();

    @ManyToMany

    @JoinTable(name = "exercise_muscles",
    joinColumns = @JoinColumn(name = "exercise_id"),
    inverseJoinColumns = @JoinColumn(name = "muscle_id"))
    private Set<Muscle> muscles = new HashSet<>();



    @Lob
    private String description;

}
