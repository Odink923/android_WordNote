package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "term_with_definitions",
        value = "SELECT terms.*, definitions.* FROM terms INNER JOIN definitions ON terms.termId = definitions.id")
public class TermWithDefinition {
    @Embedded
    public Term term;
    @Relation(
            parentColumn = "termId",
            entityColumn = "id",
            associateBy = @Junction(TermDefinition.class)
    )
    public List<Definition> definitionList;
}
