package com.example.user_authentication;

import java.io.Serializable;

/**
 * Represents a task in a project management context.
 */
public class Task implements Serializable {

    private String id;
    private String name;
    private String description;
    private int estimatedEffort;
    private String status;

    public Task(String id, String name, String description, int estimatedEffort, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.estimatedEffort = estimatedEffort;
        this.status = status;
    }

    // Getters and setters for each field
    // ...

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", estimatedEffort=" + estimatedEffort +
                ", status='" + status + '\'' +
                '}';
    }
}