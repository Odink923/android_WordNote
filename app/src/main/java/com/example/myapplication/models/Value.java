package com.example.myapplication.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "values")
public class Value {
    @PrimaryKey(autoGenerate = true)
    private Long valueId;
    private String text;
    private int language;

    public Value() {
    }

    public Value(String text, int language) {
        this.text = text;
        this.language = language;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }
}
