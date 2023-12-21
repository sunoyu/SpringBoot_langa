package com.udemy.learnjpaandhibernate.course.jdbc;

import com.udemy.learnjpaandhibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component   // 컴포넌트가 있어야 Springboot가 스캔하여 사용함.
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "JAVA", "LANGA"));
        repository.insert(new Course(2, "AWS", "LANGA"));

        repository.delete(1);
    }
}
