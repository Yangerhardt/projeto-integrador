package com.example.workit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "workout_exercises")
public class WorkoutExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "treino_id", nullable = false)
    @JsonIgnore
    private Workout workout;

    @Column(name = "nome_exercicio", columnDefinition = "TEXT")
    private String nomeExercicio;

    @Column(name = "series", columnDefinition = "TEXT")
    private String series;

    @Column(name = "carga")
    private Integer carga;

    public WorkoutExercise(Long treinoId, String nomeExercicio, String series, Integer carga) {
        this.workout = new Workout();
        this.workout.setId(treinoId);
        this.nomeExercicio = nomeExercicio;
        this.series = series;
        this.carga = carga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
}
