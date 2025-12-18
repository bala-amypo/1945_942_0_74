package com.example.demo.Serviveimple;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.Service.StudentService;
@Service
public class StudentServiceImple implements StudentService{
@Autowired
    
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}