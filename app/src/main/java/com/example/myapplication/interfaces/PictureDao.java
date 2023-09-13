package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.Picture;
@Dao
public interface PictureDao {
    @Insert
    Long insert(Picture obj);

    @Update
    void update(Picture obj);

    @Delete
    void delete(Picture obj);

    @Query("SELECT * FROM pictures WHERE pictureId = :id")
    Picture getImageById(Long id);
}
