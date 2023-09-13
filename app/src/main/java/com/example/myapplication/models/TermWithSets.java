package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "term_with_sets",
        value = "SELECT terms.*, sets.* FROM terms INNER JOIN sets ON terms.termId = sets.setId")
public class TermWithSets {
    @Embedded
    public Term term;
    @Relation(
            parentColumn = "termId",
            entityColumn = "setId",
            associateBy = @Junction(TermSet.class)
    )
    public List<Set> setList;
}
