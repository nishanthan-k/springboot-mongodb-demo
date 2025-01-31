package com.nishanthan.mongodemo.springboot_mongodb_demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nishanthan.mongodemo.springboot_mongodb_demo.enums.Gender;
import com.nishanthan.mongodemo.springboot_mongodb_demo.models.Address;
import com.nishanthan.mongodemo.springboot_mongodb_demo.models.Student;
import com.nishanthan.mongodemo.springboot_mongodb_demo.repo.StudentRepo;

@SpringBootApplication
public class SpringbootMongodbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepo repo) {
		return args -> {
			// Create an Address object for the address field
			Address address = new Address("TempCountry", "TempCity", "TempPostalCode");

			// Create a Student object with proper values
			Student s = new Student(
					"Temp",
					"Temp",
					"Temp",
					Gender.MALE,
					address,
					new BigDecimal("100.00"), // Replace with the actual value
					LocalDateTime.now() // Use current time or specify a time
			);

			// Insert the student into the repository
			repo.insert(s);
		};
	}

}
