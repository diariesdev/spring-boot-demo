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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
                Student alita = new Student(
                        1L,
                        "Alita",
                        "Alita@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5)
                );

            repository.saveAll(List.of(alita));
        };
    }
}
