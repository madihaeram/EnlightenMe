package com.enlightenMe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enlightenMe.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{

}
