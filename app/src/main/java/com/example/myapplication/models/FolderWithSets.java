package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

@DatabaseView(viewName = "folder_with_sets",
        value = "SELECT folders.*, sets.* FROM folders INNER JOIN sets ON folders.folderId = sets.setId")
public class FolderWithSets {
    @Embedded
    public Folder folder;
    @Relation(
            parentColumn = "folderId",
            entityColumn = "setId",
            associateBy = @Junction(SetFolder.class)
    )
    public List<Set> setList;
}