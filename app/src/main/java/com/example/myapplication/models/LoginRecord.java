package com.example.myapplication.models;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.sql.Date;

@Entity(tableName = "login_records",
        foreignKeys = @ForeignKey(entity = User.class,
                parentColumns = "id",
                childColumns = "userId"))
public class LoginRecord {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private Long userId;
    private Date loginDate;

    public LoginRecord() {
    }

    public LoginRecord(Long userId, Date loginDate) {
        this.userId = userId;
        this.loginDate = loginDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
