package com.example.myapplication.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "terms",
        foreignKeys = @ForeignKey(entity = User.class,
                parentColumns = "id",
                childColumns = "userId"))
public class Term {
    @PrimaryKey(autoGenerate = true)
    private Long termId;
    private Long userId;
    @ColumnInfo(defaultValue = "false")
    private Boolean selectElement;

    public Term() {
    }

    public Term(Long userId, Boolean selectElement) {
        this.userId = userId;
        this.selectElement = selectElement;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getSelectElement() {
        return selectElement;
    }

    public void setSelectElement(Boolean selectElement) {
        this.selectElement = selectElement;
    }

    public Boolean getSelect() {
        return selectElement;
    }

    public void setSelect(Boolean select) {
        this.selectElement = select;
    }
}