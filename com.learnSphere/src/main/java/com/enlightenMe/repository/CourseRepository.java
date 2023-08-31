package com.enlightenMe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enlightenMe.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
