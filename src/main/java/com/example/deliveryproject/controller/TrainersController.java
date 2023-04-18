package com.example.deliveryproject.controller;

import com.example.deliveryproject.dto.TrainersDto;
import com.example.deliveryproject.entity.Trainers;
import com.example.deliveryproject.service.TrainersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TrainersController {
    private final TrainersService trainersService;
    @Autowired
    public TrainersController(TrainersService trainersService) {
        this.trainersService = trainersService;
    }

    @GetMapping("/trainers")
    public String getTrainers(Model model){
        List<Trainers> trainers = trainersService.getAllTrainers();
        List<TrainersDto> trainersDtos = trainers.stream().map(TrainersDto::from).collect(Collectors.toList());
        model.addAttribute("allTrainers",trainersDtos);
        return "index";
    }
}
