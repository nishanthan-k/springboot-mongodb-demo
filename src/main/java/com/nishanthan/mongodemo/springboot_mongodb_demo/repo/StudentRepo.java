package com.nishanthan.mongodemo.springboot_mongodb_demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nishanthan.mongodemo.springboot_mongodb_demo.models.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {

}
