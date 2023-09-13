package com.example.myapplication.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "definitions")
public class Definition {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String textDefinition;
    private int language;

    public Definition() {
    }

    public Definition(String textDefinition, int language) {
        this.textDefinition = textDefinition;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextDefinition() {
        return textDefinition;
    }

    public void setTextDefinition(String textDefinition) {
        this.textDefinition = textDefinition;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }
}
