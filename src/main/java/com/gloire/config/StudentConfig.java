package com.gloire.config;

import com.gloire.model.Student;
import com.gloire.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student glory = new Student(
                    "Glory Beya",
                    "gloire@gmail.com",
                    LocalDate.of(2000, Month.AUGUST,2)
                    );
            Student benoit = new Student(
                    "Benoit Ntumba",
                    "benoit@gmail.com",
                    LocalDate.of(2010, Month.APRIL,2)
            );
            studentRepository.saveAll(List.of(glory, benoit));
        };
    }
}
