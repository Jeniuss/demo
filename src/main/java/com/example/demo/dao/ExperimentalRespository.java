package com.example.demo.dao;

import com.example.demo.model.ExperimentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExperimentalRespository extends JpaRepository<ExperimentalEntity, Long> {
    Optional<ExperimentalEntity> findAllById(Long id);
}
