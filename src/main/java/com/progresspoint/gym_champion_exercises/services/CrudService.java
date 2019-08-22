package com.progresspoint.gym_champion_exercises.services;

import java.util.Set;

public interface CrudService<T, ID>{

    Set<T> findAll();
    T findById(ID id);
    T findByName(String name);
}
