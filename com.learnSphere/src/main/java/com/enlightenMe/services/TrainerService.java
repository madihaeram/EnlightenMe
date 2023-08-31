package com.enlightenMe.services;

import java.util.List;

import com.enlightenMe.entity.Course;
import com.enlightenMe.entity.Lesson;

public interface TrainerService {
	public Course addCourse(Course course);
	
	public String saveCourse(Course course);
	
	public String addLesson(Lesson lesson);
	
	public Course getCourse(int courseId);
	
	public List<Course> courseList();
}
