package com.enlightenMe.services;

import java.util.List;

import com.enlightenMe.entity.Comments;

public interface CommentService {
	List<Comments> commentList();
	String addComment(Comments comment);
}
