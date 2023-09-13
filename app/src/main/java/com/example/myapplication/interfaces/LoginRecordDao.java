package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.LoginRecord;

import java.util.List;
@Dao
public interface LoginRecordDao {
    @Insert
    Long insert(LoginRecord obj);

    @Update
    void update(LoginRecord obj);

    @Delete
    void delete(LoginRecord obj);
    @Query("SELECT * FROM login_records WHERE userId = :userId")
    List<LoginRecord> getAllByUserId(Long userId);
}
