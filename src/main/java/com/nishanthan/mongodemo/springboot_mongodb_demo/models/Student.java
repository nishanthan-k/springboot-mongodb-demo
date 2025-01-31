package com.nishanthan.mongodemo.springboot_mongodb_demo.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nishanthan.mongodemo.springboot_mongodb_demo.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document
@AllArgsConstructor
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private BigDecimal totalSpendInBooks;
    private LocalDateTime createdAt;

    public Student(String firstName, String lastName, String email, Gender gender, Address address,
            BigDecimal totalSpendInBooks, LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.totalSpendInBooks = totalSpendInBooks;
        this.createdAt = createdAt;
    }

}
