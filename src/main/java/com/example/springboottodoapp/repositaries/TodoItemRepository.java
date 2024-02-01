package com.example.springboottodoapp.repositaries;

import com.example.springboottodoapp.models.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<Todoitem, Long> {

}

