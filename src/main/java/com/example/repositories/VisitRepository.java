package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.Visit;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
}

