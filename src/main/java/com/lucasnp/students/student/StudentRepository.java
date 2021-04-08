package com.lucasnp.students.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // This optional will transform to a SQL query
    // SELECT * FROM student WHERE email = ?
    @Query("SELECT s FROM Student s WHERE s.email = ?1") // s here corresponds to our Student.java where we have annotate @Entity
    Optional<Student> findStudentByEmail(String email);
}
