package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.ProjectAssignment;

public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssignment, Integer> {
}

