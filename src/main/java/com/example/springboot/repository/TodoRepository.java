package com.example.springboot.repository;

import com.example.springboot.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    //                          ⬆️Entity  ⬆️ID type
    // Spring AUTO-GENERATES all CRUD methods!

    List<Todo> findByCompleted(boolean completed);

    List<Todo> findByTitleContaining(String keyword);
}