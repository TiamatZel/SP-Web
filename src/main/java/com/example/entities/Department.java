package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "chief_id", referencedColumnName = "id")
    private Employee chief;

    // Getters y Setters
}
