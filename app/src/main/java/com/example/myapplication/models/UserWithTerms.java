package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "user_with_terms",
        value = "SELECT users.*, terms.* FROM users INNER JOIN terms ON users.id = terms.termId")
public class UserWithTerms {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "id",
            entityColumn = "termId"
    )
    public List<Term> terms;
}
