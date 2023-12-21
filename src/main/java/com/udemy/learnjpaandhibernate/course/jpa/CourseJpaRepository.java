package com.udemy.learnjpaandhibernate.course.jpa;

import com.udemy.learnjpaandhibernate.course.Course;
import com.udemy.learnjpaandhibernate.course.CourseCommandLineRunner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext   // @AutoWired도 되지만 보다 구체적인 어노테이션
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

}
