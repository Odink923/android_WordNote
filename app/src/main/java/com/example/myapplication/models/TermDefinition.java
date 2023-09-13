package com.example.myapplication.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "term_definition", primaryKeys = {"termId", "definitionId"},
        foreignKeys = {
                @ForeignKey(entity = Term.class, parentColumns = "termId", childColumns = "termId"),
                @ForeignKey(entity = Definition.class, parentColumns = "id", childColumns = "definitionId")
        })
public class TermDefinition {
    @NonNull
    private Long id;
    @NonNull
    private Long termId;
    @NonNull
    private Long definitionId;

    public TermDefinition() {
    }

    public TermDefinition(@NonNull Long termId, @NonNull Long definitionId) {
        this.termId = termId;
        this.definitionId = definitionId;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    @NonNull
    public Long getTermId() {
        return termId;
    }

    public void setTermId(@NonNull Long termId) {
        this.termId = termId;
    }

    @NonNull
    public Long getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(@NonNull Long definitionId) {
        this.definitionId = definitionId;
    }
}
