package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.SetWithTerms;

import java.util.List;
@Dao
public interface SetWithTermsDao {
    @Query("SELECT * FROM sets WHERE setId = :setId")
    List<SetWithTerms> getTermsOfSet(Long setId);
}
