package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "set_with_terms",
        value = "SELECT sets.*, terms.* FROM sets INNER JOIN terms ON sets.setId = terms.termId")
public class SetWithTerms {
    @Embedded
    public Set set;
    @Relation(
            parentColumn = "setId",
            entityColumn = "termId",
            associateBy = @Junction(TermSet.class)
    )
    public List<Term> termList;
}
