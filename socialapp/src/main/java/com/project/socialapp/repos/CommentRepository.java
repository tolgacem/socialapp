package com.project.socialapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.socialapp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
