package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}

