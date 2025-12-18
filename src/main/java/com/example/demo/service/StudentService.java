package com.example.PracticeProject.service;

import org.springframework.stereotype.Service;

import com.example.PracticeProject.entity.StuEnt;

@Service
public interface StudentService {
    StuEnt saveStudent(StuEnt student);
}