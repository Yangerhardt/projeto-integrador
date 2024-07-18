package com.example.workit.controller;

import com.example.workit.model.WorkoutExercise;
import com.example.workit.service.WorkoutExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workout-exercises")
public class WorkoutExerciseController {
    @Autowired
    private WorkoutExerciseService workoutExerciseService;

    @GetMapping
    public List<WorkoutExercise> getAllWorkoutExercises() {
        return workoutExerciseService.getAllWorkoutExercises();
    }

    @GetMapping("/{id}")
    public WorkoutExercise getWorkoutExerciseById(@PathVariable Long id) {
        return workoutExerciseService.getWorkoutExerciseById(id);
    }

    @PostMapping
    public WorkoutExercise createWorkoutExercise(@RequestBody WorkoutExercise workoutExercise) {
        return workoutExerciseService.saveWorkoutExercise(workoutExercise);
    }

    @PutMapping("/{id}")
    public WorkoutExercise updateWorkoutExercise(@PathVariable Long id, @RequestBody WorkoutExercise workoutExercise) {
        workoutExercise.setId(id);
        return workoutExerciseService.saveWorkoutExercise(workoutExercise);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkoutExercise(@PathVariable Long id) {
        workoutExerciseService.deleteWorkoutExercise(id);
    }
}
