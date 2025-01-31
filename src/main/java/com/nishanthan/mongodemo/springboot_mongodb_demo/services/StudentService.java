package com.nishanthan.mongodemo.springboot_mongodb_demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nishanthan.mongodemo.springboot_mongodb_demo.models.Student;
import com.nishanthan.mongodemo.springboot_mongodb_demo.repo.StudentRepo;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
