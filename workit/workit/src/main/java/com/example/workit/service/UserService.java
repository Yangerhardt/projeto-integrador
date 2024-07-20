package com.example.workit.service;

import com.example.workit.model.User;
import com.example.workit.model.Workout;
import com.example.workit.model.WorkoutExercise;
import com.example.workit.repository.UserRepository;
import com.example.workit.repository.WorkoutExerciseRepository;
import com.example.workit.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final WorkoutExerciseRepository workoutExerciseRepository;
    private final WorkoutRepository workoutRepository;

    @Autowired
    public UserService(UserRepository userRepository, WorkoutExerciseRepository workoutExerciseRepository, WorkoutRepository workoutRepository) {
        this.userRepository = userRepository;
        this.workoutExerciseRepository = workoutExerciseRepository;
        this.workoutRepository = workoutRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        User savedUser = userRepository.save(user);

        createWorkoutsForUser(savedUser.getId());

        return savedUser;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    private void createWorkoutsForUser(Long userId) {
        // Criação dos treinos
        Workout workout1 = new Workout(userId, "PEITO / TRÍCEPS", "SEGUNDA-FEIRA");
        Workout workout2 = new Workout(userId, "COSTAS / BÍCEPS", "TERÇA-FEIRA");
        Workout workout3 = new Workout(userId, "PERNA", "QUARTA-FEIRA");
        Workout workout4 = new Workout(userId, "PEITO / TRÍCEPS", "QUINTA-FEIRA");
        Workout workout5 = new Workout(userId, "COSTAS / BÍCEPS", "SEXTA-FEIRA");
        Workout workout6 = new Workout(userId, "PERNA", "SÁBADO");

        workoutRepository.saveAll(Arrays.asList(workout1, workout2, workout3, workout4, workout5, workout6));

        createWorkoutExercises(workout1.getId());
        createWorkoutExercises(workout2.getId());
        createWorkoutExercises(workout3.getId());
        createWorkoutExercises(workout4.getId());
        createWorkoutExercises(workout5.getId());
        createWorkoutExercises(workout6.getId());
    }

    private void createWorkoutExercises(Long treinoId) {
        List<WorkoutExercise> exercises = Arrays.asList(
                new WorkoutExercise(treinoId, "SUPINO RETO", "4 x 12", 20),
                new WorkoutExercise(treinoId, "SUPINO INCLINADO", "4 x 12", 15),
                new WorkoutExercise(treinoId, "CRUCIFIXO", "4 x 12", 10),
                new WorkoutExercise(treinoId, "TRÍCEPS FRANCÊS", "4 x 12", 8),
                new WorkoutExercise(treinoId, "TRÍCEPS BARRA H", "4 x 12", 10),
                new WorkoutExercise(treinoId, "TRÍCEPS BARRA RETA", "4 x 12", 30)
        );

        workoutExerciseRepository.saveAll(exercises);
    }
}
