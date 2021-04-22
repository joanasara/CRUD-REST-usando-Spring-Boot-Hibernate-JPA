package com.springboot.todo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String description;

	@Column
	private Boolean done;

	@Column
	@JsonFormat(pattern = "dd/mm/yyyy  HH:mm")
	private LocalDateTime createdDate;

	@Column
	private LocalDateTime doneDate;

	public Todo() {

	}

	public Todo(Long id, String description, Boolean done, LocalDateTime createdDate, LocalDateTime doneDate) {

		this.id = id;
		this.description = description;
		this.done = done;
		this.createdDate = createdDate;
		this.doneDate = doneDate;
	}
	
	
	@PrePersist
	public void beforeSave() {
		setCreatedDate(LocalDateTime.now());
		
		
		
		
	}
	

}
