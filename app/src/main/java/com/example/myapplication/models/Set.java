package com.example.myapplication.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.myapplication.enums.AccessConverter;

@Entity(tableName = "sets",
        foreignKeys = @ForeignKey(entity = User.class,
                parentColumns = "id",
                childColumns = "userId"))
@TypeConverters({AccessConverter.class})
public class Set {
    @PrimaryKey(autoGenerate = true)
    private Long setId;
    private String name;
    private String description;
    private Long userId;
    @ColumnInfo(defaultValue = "1")
    private int editableBy;
    @ColumnInfo(defaultValue = "2")
    private int visibleTo;

    public Set() {
    }

    public Set(String name, String description, Long userId) {
        this.name = name;
        this.description = description;
        this.userId = userId;
    }

    public Long getSetId() {
        return setId;
    }

    public void setSetId(Long setId) {
        this.setId = setId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public int getEditableBy() {
        return editableBy;
    }

    public void setEditableBy(int editableBy) {
        this.editableBy = editableBy;
    }

    public int getVisibleTo() {
        return visibleTo;
    }

    public void setVisibleTo(int visibleTo) {
        this.visibleTo = visibleTo;
    }
}
