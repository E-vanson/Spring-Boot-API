package com.example.springboot.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudent(){
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
