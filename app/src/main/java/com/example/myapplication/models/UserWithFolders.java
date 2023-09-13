package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "user_with_folders",
        value = "SELECT users.*, folders.* FROM users INNER JOIN folders ON users.id = folders.folderId")
public class UserWithFolders {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "id",
            entityColumn = "folderId"
    )
    public List<Folder> folders;
}
