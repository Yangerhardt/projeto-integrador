package com.example.workit.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user_workout_progress")
public class UserWorkoutProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date data;
    private int frequenciaAcumulada;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getFrequenciaAcumulada() {
        return frequenciaAcumulada;
    }

    public void setFrequenciaAcumulada(int frequenciaAcumulada) {
        this.frequenciaAcumulada = frequenciaAcumulada;
    }
}
