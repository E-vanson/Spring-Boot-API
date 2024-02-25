package com.example.springboot;

import com.example.springboot.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Somebody",
						LocalDate.of(2000, Month.JULY,28),
						"somebody@gmail.com",
						22
				)
		);
	}

}
