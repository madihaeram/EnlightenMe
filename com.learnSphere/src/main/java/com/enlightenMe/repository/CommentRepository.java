package com.enlightenMe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enlightenMe.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments,Integer>{

}
