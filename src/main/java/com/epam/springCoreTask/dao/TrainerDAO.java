package com.epam.springCoreTask.dao;

import java.util.List;
import java.util.UUID;

import com.epam.springCoreTask.model.Trainer;

public interface TrainerDAO {
    
    Trainer create(Trainer trainer);
    Trainer findById(UUID id);
    Trainer update(Trainer trainer);
    List<Trainer> findAll();
    
}
