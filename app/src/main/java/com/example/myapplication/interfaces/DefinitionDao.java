package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Definition;
@Dao
public interface DefinitionDao {
    @Insert
    Long insert(Definition obj);

    @Update
    void update(Definition obj);

    @Delete
    void delete(Definition obj);
    @Query("SELECT * FROM definitions WHERE id = :id")
    Definition getDefinitionById(Long id);

    @Query("SELECT * FROM definitions WHERE textDefinition = :str")//??
    Definition findByDefinitions(String str);

    @Query("UPDATE definitions SET textDefinition = :newText WHERE id = :definitionId")
    void updateText(Long definitionId, String newText);

    @Query("UPDATE definitions SET language = :newLanguage WHERE id = :definitionId")
    void updateLanguage (Long definitionId, int newLanguage);
}
