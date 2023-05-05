package com.example.deliveryproject.repository;

import com.example.deliveryproject.entity.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainersRepository extends JpaRepository<Trainers,Long> {
    List<Trainers> findTrainersByTitle(String title);
    List<Trainers> findTrainersByCategory(String category);


}
