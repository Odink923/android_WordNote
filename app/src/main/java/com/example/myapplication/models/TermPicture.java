package com.example.myapplication.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "term_picture", primaryKeys = {"termId", "pictureId"},
        foreignKeys = {
                @ForeignKey(entity = Term.class, parentColumns = "termId", childColumns = "termId"),
                @ForeignKey(entity = Picture.class, parentColumns = "pictureId", childColumns = "pictureId")
        })
public class TermPicture {
    @NonNull
    private Long termId;
    @NonNull
    private Long pictureId;

    public TermPicture() {
    }

    public TermPicture(@NonNull Long termId, @NonNull Long pictureId) {
        this.termId = termId;
        this.pictureId = pictureId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }
}
