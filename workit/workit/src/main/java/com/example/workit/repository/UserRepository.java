package com.example.workit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workit.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
