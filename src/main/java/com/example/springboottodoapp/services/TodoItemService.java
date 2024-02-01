package com.example.springboottodoapp.services;

import com.example.springboottodoapp.models.Todoitem;
import com.example.springboottodoapp.repositaries.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {
    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<Todoitem> getAll() {
        return todoItemRepository.findAll();
    }
    public Optional<Todoitem> getById(Long id) {
        return todoItemRepository.findById(id);
    }
    public Todoitem save(Todoitem todoItem) {

        todoItem.setUpdatedAt(Instant.now());
        return todoItemRepository.save(todoItem);
    }
    public void delete(Todoitem todoItem) {
        todoItemRepository.delete(todoItem);
    }

}
