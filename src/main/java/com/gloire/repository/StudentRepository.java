package com.gloire.repository;

import com.gloire.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //@Query("select s from Student s where s.email=?1")
    Optional<Student> findStudentByEmail(String email);
    Optional<Student> findStudentById(Long id);
}
