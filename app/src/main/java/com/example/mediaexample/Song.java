package com.example.mediaexample;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;
    private int Id;

    public Song(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
