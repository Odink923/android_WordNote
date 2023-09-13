package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.myapplication.models.TermWithPictures;

import java.util.List;
@Dao
public interface TermWithPicturesDao {
    @Query("SELECT * FROM terms WHERE termId = :termId")
    List<TermWithPictures> getPicturesOfTerm(Long termId);
}
