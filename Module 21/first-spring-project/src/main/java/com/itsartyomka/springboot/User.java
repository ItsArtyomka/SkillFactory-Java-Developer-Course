package com.itsartyomka.springboot;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Means that this will be a table db 'User'
@Data
public class User {
    @Id // Notation of ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Notation of ID Generation Automation
    private Long id;
    private String name;

    public User(String name) {
        this.name = name;
    }
}
