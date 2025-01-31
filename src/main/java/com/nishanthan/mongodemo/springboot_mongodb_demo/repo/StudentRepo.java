package com.nishanthan.mongodemo.springboot_mongodb_demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nishanthan.mongodemo.springboot_mongodb_demo.models.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

}
