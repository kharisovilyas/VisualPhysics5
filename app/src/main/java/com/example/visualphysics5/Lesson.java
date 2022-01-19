package com.example.visualphysics5;

public class Lesson {

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    private final String title, description;

    public Lesson(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
