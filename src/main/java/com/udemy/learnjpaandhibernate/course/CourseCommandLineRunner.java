package com.udemy.learnjpaandhibernate.course;

import com.udemy.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component   // 컴포넌트가 있어야 Springboot가 스캔하여 사용함.
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "JAVA", "LANGA"));
        repository.insert(new Course(2, "AWS", "LANGA"));
        repository.insert(new Course(3, "AZURE", "LANGA"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
