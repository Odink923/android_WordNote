package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.SetWithFolders;

import java.util.List;
@Dao
public interface SetWithFoldersDao {
    @Query("SELECT sets.*, folders.* FROM sets INNER JOIN folders ON sets.setId = folders.folderId WHERE setId = :setId")
    List<SetWithFolders> getFoldersOfSet(Long setId);
}
