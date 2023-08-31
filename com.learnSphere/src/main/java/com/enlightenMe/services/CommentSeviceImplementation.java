package com.enlightenMe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enlightenMe.entity.Comments;
import com.enlightenMe.repository.CommentRepository;

@Service
public class CommentSeviceImplementation implements CommentService {

	@Autowired
	CommentRepository commentRepo;
	@Override
	public List<Comments> commentList() {
		return commentRepo.findAll();
	}
	@Override
	public String addComment(Comments comment) {
		commentRepo.save(comment);
		return "comment added";
	}

}
