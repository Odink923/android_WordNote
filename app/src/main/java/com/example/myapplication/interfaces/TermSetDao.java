package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Definition;
import com.example.myapplication.models.TermSet;
@Dao
public interface TermSetDao {
    @Insert
    Long insert(TermSet obj);

    @Update
    void update(TermSet obj);

    @Delete
    void delete(TermSet obj);
    @Query("DELETE FROM term_set WHERE termId = :termId AND setId = :setId")
    void deleteTermFromSet(Long termId, Long setId);
}
