package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

/** This class is used to create and save an object row in the database table student*/
/*@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student dennis = new Student(
                    1L,
                    "dennis",
                    "dennis@gmail.com",
                    LocalDate.of(1999, JANUARY, 8)
            );
            Student eugene = new Student(
                    "eugene",
                    "eugene@gmail.com",
                    LocalDate.of(1992, JANUARY, 8)
            );

            //Save to database by involing our repository
            repository.saveAll(List.of(dennis, eugene));
        };
    }
}
*/
