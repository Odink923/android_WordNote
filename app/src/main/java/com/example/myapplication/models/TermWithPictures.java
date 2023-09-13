package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "term_with_pictures",
        value = "SELECT terms.*, pictures.* FROM terms INNER JOIN pictures ON terms.termId = pictures.pictureId")
public class TermWithPictures {
    @Embedded
    public Term term;
    @Relation(
            parentColumn = "termId",
            entityColumn = "pictureId",
            associateBy = @Junction(TermPicture.class)
    )
    public List<Picture> pictureList;
}
