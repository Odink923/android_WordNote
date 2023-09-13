package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Folder;

import java.util.List;
@Dao
public interface FolderDao {
    @Insert
    Long insert(Folder obj);

    @Update
    void update(Folder obj);

    @Delete
    void delete(Folder obj);
    @Query("SELECT folders.* FROM folders " +
            "INNER JOIN set_folder ON folders.folderId = set_folder.folderId " +
            "WHERE folders.userId = :userId")
    List<Folder> getAllFoldersByUserId(Long userId);

    @Query("SELECT * FROM folders WHERE name = :str")//????
    Folder findByFolder(String str);

    @Query("UPDATE folders SET name = :newName WHERE folderId = :folderId")
    void updateName(Long folderId, String newName);

    @Query("UPDATE folders SET description = :newDescription WHERE folderId = :folderId")
    void updateDescription(Long folderId, String newDescription);
}
