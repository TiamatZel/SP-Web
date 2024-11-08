package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}

