package com.example.demo.Serviceimpl;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.Service.StudentService;
@Service
public class StudentServiceImple implements StudentService{

    private final StudentRepository StudentRepository;
    public StudentServiceImple(StudentRepository studentRepository){
        this.StudentRepository=studentRepository;
    }

    public student saveStudent(student student){
        return studentRepository.save()
    }
}