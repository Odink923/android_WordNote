package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.TermWithDefinition;

import java.util.List;
@Dao
public interface TermWithDefinitionsDao {
    @Query("SELECT * FROM terms WHERE termId = :termId")
    List<TermWithDefinition> getDefinitionsOfTerm(Long termId);
}
