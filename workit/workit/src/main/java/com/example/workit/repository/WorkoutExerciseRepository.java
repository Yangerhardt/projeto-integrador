package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.WorkoutExercise;

import java.util.List;

public interface WorkoutExerciseRepository extends JpaRepository<WorkoutExercise, Long> {
    List<WorkoutExercise> findByWorkoutId(Long workoutId);
}
