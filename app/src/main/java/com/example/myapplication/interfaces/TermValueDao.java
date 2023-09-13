package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.TermValue;
@Dao
public interface TermValueDao {
    @Insert
    Long insert(TermValue obj);

    @Update
    void update(TermValue obj);

    @Delete
    void delete(TermValue obj);
    @Query("DELETE FROM term_value WHERE termId = :termId AND valueId = :valueId")
    void deleteValueFromTerm(Long termId, Long valueId);
}
