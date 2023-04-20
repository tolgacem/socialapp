package com.project.socialapp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.socialapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	List<Post> findByUserId(Long userId); //returns each userId posts
}
