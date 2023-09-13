package com.example.myapplication.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "term_set", primaryKeys = {"termId", "setId"},
        foreignKeys = {
                @ForeignKey(entity = Term.class, parentColumns = "termId", childColumns = "termId"),
                @ForeignKey(entity = Set.class, parentColumns = "setId", childColumns = "setId")
        })
public class TermSet {
    @NonNull
    private Long termId;
    @NonNull
    private Long setId;

    public TermSet() {
    }

    public TermSet(@NonNull Long termId, @NonNull Long setId) {
        this.termId = termId;
        this.setId = setId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public Long getSetId() {
        return setId;
    }

    public void setSetId(Long setId) {
        this.setId = setId;
    }
}
