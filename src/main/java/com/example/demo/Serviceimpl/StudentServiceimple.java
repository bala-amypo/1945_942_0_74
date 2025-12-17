package com.example.demo.Serviceimpl;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.Service.StudentService;
@Service
public class StudentServiceImple implements StudentService{
@Autowired
    // private final StudentRepository StudentRepository;
    // public StudentServiceImple(StudentRepository studentRepository){
    //     this.StudentRepository=studentRepository;
    // }
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}