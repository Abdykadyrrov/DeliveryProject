package com.example.deliveryproject.controller;

import com.example.deliveryproject.entity.Trainers;
import com.example.deliveryproject.service.TrainersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainersController {
    private final TrainersService trainersService;
    @Autowired
    public TrainersController(TrainersService trainersService) {
        this.trainersService = trainersService;
    }

    @GetMapping("/trainers")
    public String getTrainers(Model model){
        List<Trainers> trainers = trainersService.getAllTrainers();
        model.addAttribute("allTrainers",trainers);
        return "index"; // Here, you are returning the name of the template file with the model object
    }
}
