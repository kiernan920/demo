package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        List<Student> l = new ArrayList<>();
        l.add(new Student(1L, "Miriam", "mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21));
        return l;
    }
}
