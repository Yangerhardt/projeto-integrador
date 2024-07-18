package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}
