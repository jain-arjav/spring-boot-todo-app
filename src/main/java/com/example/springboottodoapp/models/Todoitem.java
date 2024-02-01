package com.example.springboottodoapp.models;
import java.time.Instant;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "todo_items")

public class Todoitem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Title;
    private String description;
    private Boolean isComplete;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Instant updatedAt;


    @Override
    public String toString(){
        return  String.format("TodoItem{id=%d, description='%s',isComplete = '%s', date='%s', updatedAt='%s'}",
                id, description, isComplete, date, updatedAt);

    }

}
