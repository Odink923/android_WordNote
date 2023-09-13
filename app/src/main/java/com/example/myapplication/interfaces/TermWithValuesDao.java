package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.TermWithValues;

import java.util.List;
@Dao
public interface TermWithValuesDao {
    @Query("SELECT * FROM terms WHERE termId = :termId")
    List<TermWithValues> getValuesOfTerm(Long termId);
}
