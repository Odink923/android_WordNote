package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Value;

@Dao
public interface ValueDao {
    @Insert
    Long insert(Value obj);

    @Update
    void update(Value obj);

    @Delete
    void delete(Value obj);
    @Query("SELECT * FROM `values` WHERE valueId = :id")
    Value getValueById(Long id);

    @Query("SELECT * FROM `values` WHERE text = :str")//??
    Value findByValues(String str);

    @Query("UPDATE `values` SET text = :newText WHERE valueId = :valueId")
    void updateText(Long valueId, String newText);

    @Query("UPDATE `values` SET language = :newLanguage WHERE valueId = :valueId")
    void updateLanguage (Long valueId, int newLanguage);
}
