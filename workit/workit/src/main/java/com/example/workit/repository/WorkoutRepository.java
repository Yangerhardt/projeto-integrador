package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}