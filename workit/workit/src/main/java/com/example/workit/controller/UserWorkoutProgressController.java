package com.example.workit.controller;

import com.example.workit.model.UserWorkoutProgress;
import com.example.workit.service.UserWorkoutProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-workout-progress")
public class UserWorkoutProgressController {
    @Autowired
    private UserWorkoutProgressService userWorkoutProgressService;

    @GetMapping
    public List<UserWorkoutProgress> getAllUserWorkoutProgress() {
        return userWorkoutProgressService.getAllUserWorkoutProgress();
    }

    @GetMapping("/{id}")
    public UserWorkoutProgress getUserWorkoutProgressById(@PathVariable Long id) {
        return userWorkoutProgressService.getUserWorkoutProgressById(id);
    }

    @PostMapping
    public UserWorkoutProgress createUserWorkoutProgress(@RequestBody UserWorkoutProgress userWorkoutProgress) {
        return userWorkoutProgressService.saveUserWorkoutProgress(userWorkoutProgress);
    }

    @PutMapping("/{id}")
    public UserWorkoutProgress updateUserWorkoutProgress(@PathVariable Long id, @RequestBody UserWorkoutProgress userWorkoutProgress) {
        userWorkoutProgress.setId(id);
        return userWorkoutProgressService.saveUserWorkoutProgress(userWorkoutProgress);
    }

    @DeleteMapping("/{id}")
    public void deleteUserWorkoutProgress(@PathVariable Long id) {
        userWorkoutProgressService.deleteUserWorkoutProgress(id);
    }
}
