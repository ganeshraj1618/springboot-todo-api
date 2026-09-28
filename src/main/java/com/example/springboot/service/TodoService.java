package com.example.springboot.service;

import com.example.springboot.entity.Todo;
import com.example.springboot.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // CREATE
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // READ ALL
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // READ ONE
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // UPDATE
    public Optional<Todo> updateTodo(Long id, Todo updatedTodo) {
        return todoRepository.findById(id).map(existingTodo -> {
            existingTodo.setTitle(updatedTodo.getTitle());
            existingTodo.setCompleted(updatedTodo.isCompleted());
            return todoRepository.save(existingTodo);
        });
    }

    // DELETE
    public boolean deleteTodo(Long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // FILTER: completed only
    public List<Todo> getCompletedTodos() {
        return todoRepository.findByCompleted(true);
    }

    // FILTER: pending only
    public List<Todo> getPendingTodos() {
        return todoRepository.findByCompleted(false);
    }

    // SEARCH by title
    public List<Todo> searchByTitle(String keyword) {
        return todoRepository.findByTitleContaining(keyword);
    }
}