package com.example.deliveryproject.dto;

import com.example.deliveryproject.entity.Trainers;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TrainersDto {
    public static TrainersDto from(Trainers trainers){
        return builder()
                .id(trainers.getId())
                .title(trainers.getTitle())
                .image(trainers.getImage())
                .price(trainers.getPrice())
                .gender(trainers.getCategory())
                .description(trainers.getDescription())
                .build();
    }

    private Long id;
    private String title;
    private String image;
    private double price;
    private String gender;
    private String description;

}
