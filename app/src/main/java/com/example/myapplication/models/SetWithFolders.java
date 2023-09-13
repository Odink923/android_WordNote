package com.example.myapplication.models;

import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;
@DatabaseView(viewName = "set_with_folders",
        value = "SELECT sets.*, folders.* FROM sets INNER JOIN folders ON sets.setId = folders.folderId")
public class SetWithFolders {
    @Embedded
    public Set set;
    @Relation(
            parentColumn = "setId",
            entityColumn = "folderId",
            associateBy = @Junction(SetFolder.class)
    )
    public List<Folder> folderList;
}
