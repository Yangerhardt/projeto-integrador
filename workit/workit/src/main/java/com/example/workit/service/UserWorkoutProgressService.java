package com.example.workit.service;

import com.example.workit.model.UserWorkoutProgress;
import com.example.workit.repository.UserWorkoutProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserWorkoutProgressService {
    @Autowired
    private UserWorkoutProgressRepository userWorkoutProgressRepository;

    public List<UserWorkoutProgress> getAllUserWorkoutProgress() {
        return userWorkoutProgressRepository.findAll();
    }

    public UserWorkoutProgress getUserWorkoutProgressById(Long id) {
        return userWorkoutProgressRepository.findById(id).orElse(null);
    }

    public UserWorkoutProgress saveUserWorkoutProgress(UserWorkoutProgress userWorkoutProgress) {
        return userWorkoutProgressRepository.save(userWorkoutProgress);
    }

    public void deleteUserWorkoutProgress(Long id) {
        userWorkoutProgressRepository.deleteById(id);
    }
}
