package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.Workout;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    List<Workout> findByUserIdAndDiasSemanaContaining(Long userId, String diasSemana);
}