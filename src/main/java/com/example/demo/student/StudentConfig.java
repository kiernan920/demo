package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student miriam = new Student(
                    "Miriam",
                    "mariam@gmail.com",
                    LocalDate.of(2005, Month.JANUARY,
                            5));
            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2001, Month.JANUARY,
                            4));
            studentRepository.saveAll(List.of(miriam,alex));
        };
    }
}
