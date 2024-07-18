package com.example.workit.service;

import com.example.workit.model.WorkoutExercise;
import com.example.workit.repository.WorkoutExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutExerciseService {
    @Autowired
    private WorkoutExerciseRepository workoutExerciseRepository;

    public List<WorkoutExercise> getAllWorkoutExercises() {
        return workoutExerciseRepository.findAll();
    }

    public WorkoutExercise getWorkoutExerciseById(Long id) {
        return workoutExerciseRepository.findById(id).orElse(null);
    }

    public WorkoutExercise saveWorkoutExercise(WorkoutExercise workoutExercise) {
        return workoutExerciseRepository.save(workoutExercise);
    }

    public void deleteWorkoutExercise(Long id) {
        workoutExerciseRepository.deleteById(id);
    }
}
