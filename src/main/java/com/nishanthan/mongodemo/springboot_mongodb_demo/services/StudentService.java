package com.nishanthan.mongodemo.springboot_mongodb_demo.services;

import java.util.List;
import java.util.Optional;

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

    public Optional<Student> getStudent(String id) {
        return studentRepo.findById(id);
    }
}
