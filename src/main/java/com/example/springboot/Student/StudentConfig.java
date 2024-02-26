package com.example.springboot.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student somebody = new Student(
                    "Somebody",
                    LocalDate.of(2000, Month.JULY, 28),
                    "somebody@gmail.com"

            );

            Student nobody = new Student(
                    "Nobody",
                    LocalDate.of(2001,Month.DECEMBER,23),
                    "nobody@gmail.com"
            );
            repository.saveAll(
                    List.of(nobody,somebody)
            );
        };

    }

}
