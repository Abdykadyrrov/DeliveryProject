package com.example.deliveryproject.repository;

import com.example.deliveryproject.entity.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainersRepository extends JpaRepository<Trainers,Long> {
    List<Trainers> findTrainersByTitle(String title);
    List<Trainers> findTrainersByGender(String gender);


}
