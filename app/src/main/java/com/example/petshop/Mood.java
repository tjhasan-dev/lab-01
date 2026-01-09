package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // Constructor 1: default date = now
    public Mood() {
        this.date = new Date();
    }

    // Constructor 2: date passed in
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // each mood must describe itself
    public abstract String describe();
}

