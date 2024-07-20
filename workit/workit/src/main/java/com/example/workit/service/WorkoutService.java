package com.example.workit.service;

import com.example.workit.model.Workout;
import com.example.workit.model.WorkoutExercise;
import com.example.workit.repository.WorkoutExerciseRepository;
import com.example.workit.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;
    private WorkoutExerciseRepository workoutExerciseRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public Workout getWorkoutById(Long id) {
        return workoutRepository.findById(id).orElse(null);
    }

    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public void deleteWorkout(Long id) {
        workoutRepository.deleteById(id);
    }

    public List<Workout> getWorkoutsByUserIdAndDay(Long userId, String day) {
        return workoutRepository.findByUserIdAndDiasSemanaContaining(userId, day);
    }
}
