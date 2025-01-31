package com.nishanthan.mongodemo.springboot_mongodb_demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishanthan.mongodemo.springboot_mongodb_demo.models.Student;
import com.nishanthan.mongodemo.springboot_mongodb_demo.services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }
}
