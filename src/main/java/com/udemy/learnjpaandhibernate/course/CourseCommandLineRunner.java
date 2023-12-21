package com.udemy.learnjpaandhibernate.course;

import com.udemy.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.udemy.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component   // 컴포넌트가 있어야 Springboot가 스캔하여 사용함.
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "JAVA", "LANGA"));
        repository.save(new Course(2, "AWS", "LANGA"));
        repository.save(new Course(3, "AZURE", "Yoo"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findByName("AZURE"));

    }
}
