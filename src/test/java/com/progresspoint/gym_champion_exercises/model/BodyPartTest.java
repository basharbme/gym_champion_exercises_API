package com.progresspoint.gym_champion_exercises.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyPartTest {

    BodyPart bodyPart;

    @BeforeEach
    void setUp() {
        this.bodyPart = new BodyPart();
    }

    @Test
    void getId() {
        Long expected = 4L;
        bodyPart.setId(4L);

        assertEquals(expected, bodyPart.getId());
    }

    @Test
    void getName() {
    }

    @Test
    void getExercises() {
    }
}