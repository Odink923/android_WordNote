package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Definition;
import com.example.myapplication.models.SetFolder;
@Dao
public interface SetFolderDao {
    @Insert
    Long insert(SetFolder obj);

    @Update
    void update(SetFolder obj);

    @Delete
    void delete(SetFolder obj);
    @Query("DELETE FROM set_folder WHERE folderId = :folderId AND setId = :setId")
    void deleteSetFromFolder(Long folderId, Long setId);
}
