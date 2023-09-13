package com.example.myapplication.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "term_value", primaryKeys = {"termId", "valueId"},
        foreignKeys = {
                @ForeignKey(entity = Term.class, parentColumns = "termId", childColumns = "termId"),
                @ForeignKey(entity = Value.class, parentColumns = "valueId", childColumns = "valueId")
        })
public class TermValue {
    @NonNull
    private Long termId;
    @NonNull
    private Long valueId;

    public TermValue() {
    }

    public TermValue(@NonNull Long termId, @NonNull Long valueId) {
        this.termId = termId;
        this.valueId = valueId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }
}
