package com.example.myapplication.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "set_folder", primaryKeys = {"setId", "folderId"},
        foreignKeys = {
                @ForeignKey(entity = Set.class, parentColumns = "setId", childColumns = "setId"),
                @ForeignKey(entity = Folder.class, parentColumns = "folderId", childColumns = "folderId")
        })
public class SetFolder {
    @NonNull
    private Long setId;
    @NonNull
    private Long folderId;

    public SetFolder() {
    }

    public SetFolder(@NonNull Long setId, @NonNull Long folderId) {
        this.setId = setId;
        this.folderId = folderId;
    }

    public Long getSetId() {
        return setId;
    }
   // @Ignore
    public void setSetId(Long setId) {
        this.setId = setId;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }
}
