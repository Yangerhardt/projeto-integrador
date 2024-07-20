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

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    private String tipoTreino;

    private String diasSemana;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<WorkoutExercise> exercises;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
