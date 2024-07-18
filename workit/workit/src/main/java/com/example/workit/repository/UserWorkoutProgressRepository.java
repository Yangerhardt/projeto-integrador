package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.UserWorkoutProgress;

public interface UserWorkoutProgressRepository extends JpaRepository<UserWorkoutProgress, Long> {
}
