package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Set;

import java.util.List;
@Dao
public interface SetDao {
    @Insert
    Long insert(Set obj);

    @Update
    void update(Set obj);

    @Delete
    void delete(Set obj);
    @Query("SELECT * FROM sets WHERE setId = :id")
    Set getSetById(Long id);

    @Query("SELECT sets.* FROM sets " +
            "INNER JOIN set_folder ON sets.setId = set_folder.setId " +
            "WHERE sets.userId = :userId")
    List<Set> getAllByUserId(Long userId);

    @Query("SELECT * FROM sets WHERE name = :str")//??
    Set findBySets(String str);

    @Query("UPDATE sets SET name = :newName WHERE setId = :setId")
    void updateName(Long setId, String newName);

    @Query("UPDATE sets SET description = :newDescription WHERE setId = :setId")
    void updateDescription(Long setId, String newDescription);

    @Query("UPDATE sets SET editableBy = :newEditableBy WHERE setId = :setId")
    void updateEditableBy(Long setId, int newEditableBy);

    @Query("UPDATE sets SET visibleTo = :newVisibleTo WHERE setId = :setId")
    void updateVisibleTo(Long setId, int newVisibleTo);
}
