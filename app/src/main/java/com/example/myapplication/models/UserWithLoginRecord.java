package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "user_with_login_records",
        value = "SELECT users.*, login_records.* FROM users INNER JOIN login_records ON users.id = login_records.id")
public class UserWithLoginRecord {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "id",
            entityColumn = "id"
    )
    public List<LoginRecord> loginRecords;
}
