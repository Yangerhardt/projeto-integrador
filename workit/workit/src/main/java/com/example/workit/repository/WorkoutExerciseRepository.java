package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.WorkoutExercise;

public interface WorkoutExerciseRepository extends JpaRepository<WorkoutExercise, Long> {
}
