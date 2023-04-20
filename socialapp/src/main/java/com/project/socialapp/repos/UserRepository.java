package com.project.socialapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.socialapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
