package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "term_with_values",
        value = "SELECT terms.*, `values`.* FROM terms INNER JOIN `values` ON terms.termId = `values`.valueId")
public class TermWithValues {
    @Embedded
    public Term term;
    @Relation(
            parentColumn = "termId",
            entityColumn = "valueId",
            associateBy = @Junction(TermValue.class)
    )
    public List<Value> termList;
}
