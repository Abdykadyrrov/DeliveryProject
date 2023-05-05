package com.example.deliveryproject.controller;

import com.example.deliveryproject.entity.Trainers;
import com.example.deliveryproject.service.TrainersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class TrainersController {
    private final TrainersService trainersService;
    @GetMapping("/trainers")
    public String getTrainers(Model model){
        List<Trainers> trainers = trainersService.getAllTrainers();
        model.addAttribute("trainers",trainers);
        return "index";
    }
}
