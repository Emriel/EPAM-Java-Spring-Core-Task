package com.epam.springCoreTask.dao;

import java.util.List;
import java.util.UUID;

import com.epam.springCoreTask.model.Trainee;

public interface TraineeDAO {
    
    Trainee create(Trainee trainee);
    Trainee findById(UUID id);
    Trainee update(Trainee trainee);
    boolean delete(UUID id);
    List<Trainee> findAll();
    
}
