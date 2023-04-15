package com.example.deliveryproject.service;

import com.example.deliveryproject.entity.Trainers;
import com.example.deliveryproject.repository.TrainersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainersService {
    private final TrainersRepository trainersRepository;

    public TrainersService(TrainersRepository trainersRepository) {
        this.trainersRepository = trainersRepository;
    }

    public List<Trainers> getAllTrainers(){
        return trainersRepository.findAll();
    }

    public Optional<Trainers> getTrainersById(Long id){
        return trainersRepository.findById(id);
    }

    public List<Trainers> getTrainersByTitle(String title){
        return trainersRepository.findTrainersByTitle(title);
    }

    public List<Trainers> getTrainersByGender(String gender){
        return trainersRepository.findTrainersByGender(gender);
    }

}
