package com.example.workit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "workouts")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    private String tipoTreino;

    private String diasSemana;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<WorkoutExercise> exercises;

    public Workout() {}

    public Workout(Long userId, String tipoTreino, String diasSemana) {
        this.userId = userId;
        this.tipoTreino = tipoTreino;
        this.diasSemana = diasSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Set<WorkoutExercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<WorkoutExercise> exercises) {
        this.exercises = exercises;
    }
}
