package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.TermWithSets;

import java.util.List;
@Dao
public interface TermWithSetsDao {
    @Query("SELECT * FROM terms WHERE termId = :termId")
    List<TermWithSets> getSetsOfTerm(Long termId);
}
