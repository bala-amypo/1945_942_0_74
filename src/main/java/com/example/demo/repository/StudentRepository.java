package com.example.PracticeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PracticeProject.entity.StuEnt;

@Repository
public interface StudentRepository extends JpaRepository<StuEnt, Long> {
    
      
}