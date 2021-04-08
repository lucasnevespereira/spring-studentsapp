package com.lucasnp.students.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// We use @Service or @Component to say that student service is a
// class that needs to be instantiate (it has to be a bean)
@Service
public class StudentService {


    public List<Student> getAllStudents() {
        return List.of(
            new Student(1L, "Jane", "jane@mail.com",LocalDate.of(1997, Month.APRIL, 5), 23)
        );
    }
}
