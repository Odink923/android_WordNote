package com.example.myapplication.interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.models.User;
import com.example.myapplication.models.UserWithFolders;
import com.example.myapplication.models.UserWithLoginRecord;
import com.example.myapplication.models.UserWithSets;
import com.example.myapplication.models.UserWithTerms;

import java.util.List;
@Dao
public interface UserDao {
    @Insert
    Long insert(User obj);

    @Update
    void update(User obj);

    @Delete
    void delete(User obj);
    @Query("SELECT * FROM users WHERE id = :id")
    User getUserById(Long id);

    @Query("UPDATE users SET nick = :newName WHERE id = :userId")
    void updateNick(Long userId, String newName);

    @Query("UPDATE users SET email = :newEmail WHERE id = :userId")
    void updateEmail(Long userId, String newEmail);

    @Query("UPDATE users SET password = :newPassword WHERE id = :userId")
    void updatePassword(Long userId, String newPassword);

    @Query("UPDATE users SET premium = :newPrime WHERE id = :userId")
    void updatePrime(Long userId, Boolean newPrime);

    @Query("SELECT * FROM users WHERE id = :userId")
    List<UserWithTerms> getTermsOfUser(Long userId);

    @Query("SELECT * FROM users WHERE id = :userId")
    List<UserWithFolders> getFoldersOfUser(Long userId);

    @Query("SELECT * FROM users WHERE id = :userId")
    List<UserWithSets> getSetsOfUser(Long userId);

    @Query("SELECT * FROM users WHERE id = :userId")
    List<UserWithLoginRecord> getLoginRecordsOfUser(Long userId);
}
