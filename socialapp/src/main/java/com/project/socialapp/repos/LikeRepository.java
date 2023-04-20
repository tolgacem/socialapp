package com.project.socialapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.socialapp.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
