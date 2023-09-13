package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Definition;
import com.example.myapplication.models.TermPicture;
@Dao
public interface TermPictureDao {
    @Insert
    Long insert(TermPicture obj);

    @Update
    void update(TermPicture obj);

    @Delete
    void delete(TermPicture obj);
    @Query("DELETE FROM term_picture WHERE termId = :termId AND pictureId = :pictureId")
    void deleteImageFromTerm(Long termId, Long pictureId);
}
