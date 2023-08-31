package com.enlightenMe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enlightenMe.entity.Course;
import com.enlightenMe.entity.Lesson;
import com.enlightenMe.entity.Users;
import com.enlightenMe.repository.LessonRepository;
import com.enlightenMe.repository.UserRepository;

@Service
public class StudentServicesImplementation implements StudentServices{
	@Autowired
	UserRepository ur;
	@Autowired
	LessonRepository lessonRepo;
	@Override
	public Lesson getLesson(int lessonId) {
		
		return lessonRepo.findById(lessonId).get();
		
	}
	
	

}
