package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository studentDao) {
        return args -> {
            Student student1 = new Student(
                    "Luis",
                    "Jones",
                    "maria.jones@amigoscode.com",
                    23
            );
            Student student2 = new Student(
                    "Camilo",
                    "Vivas",
                    "camilo.vivas@amigoscode.com",
                    22
            );
            studentDao.save(student1);
            studentDao.save(student2);
        };
    }
}
