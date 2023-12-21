package com.udemy.learnjpaandhibernate.course.springdatajpa;

import com.udemy.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByName(String name);     // 커스텀 메서드 지원. 이렇게만 해도 where name 셀렉트를 반환해줌.. ㄷㄷ
}
