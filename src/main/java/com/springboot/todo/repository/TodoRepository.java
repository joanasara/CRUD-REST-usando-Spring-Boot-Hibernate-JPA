package com.springboot.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
