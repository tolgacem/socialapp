package com.project.socialapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import lombok.Data;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;

@Entity
@Table(name="comment")
@Data
public class Comment {

	@Id
	Long id;
	
	@ManyToOne(fetch = FetchType.LAZY) // under one post there can be many comment
	@JoinColumn(name = "post_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE) // delete the other user related info
	@JsonIgnore // don't call
	Post post;
	
	
	@ManyToOne(fetch = FetchType.LAZY) // one user can have many comment
	@JoinColumn(name = "user_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE) // delete the other user related info
	@JsonIgnore // don't call
	User user;
	
	@Lob
    @Column(columnDefinition="text")
	String text;
}