package com.lucasnp.students.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jane = new Student("Jane", "jane@mail.com", LocalDate.of(1997, Month.APRIL, 5));
            Student alex = new Student("Alex", "alex@mail.com", LocalDate.of(2000, Month.JANUARY, 17));
            repository.saveAll(List.of(jane, alex));
        };
    };
}
