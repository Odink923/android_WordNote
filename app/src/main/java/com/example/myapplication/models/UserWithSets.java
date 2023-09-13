package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "user_with_sets",
        value = "SELECT users.*, sets.* FROM users INNER JOIN sets ON users.id = sets.setId")
public class UserWithSets {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "id",
            entityColumn = "setId"
    )
    public List<Set> sets;
}
