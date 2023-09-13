package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Definition;
import com.example.myapplication.models.TermDefinition;
@Dao
public interface TermDefinitionDao {
    @Insert
    Long insert(TermDefinition obj);

    @Update
    void update(TermDefinition obj);

    @Delete
    void delete(TermDefinition obj);
    @Query("DELETE FROM term_definition WHERE termId = :termId AND definitionId = :definitionId")
    void deleteDefinitionFromTerm(Long termId, Long definitionId);
}
