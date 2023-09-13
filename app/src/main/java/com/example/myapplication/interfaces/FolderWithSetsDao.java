package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.SetWithFolders;

import java.util.List;

@Dao
public interface FolderWithSetsDao {
    @Query("SELECT folders.*, sets.* FROM folders INNER JOIN sets ON folders.folderId = sets.setId WHERE folderId = :folderId")
    List<SetWithFolders> getSetsOfFolder(Long folderId);
}