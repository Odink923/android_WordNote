package com.example.myapplication.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "users")
public class User {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String nick;
    private String email;
    private String password;
    @Ignore
    private String confirmPassword;
    @ColumnInfo(defaultValue = "false")
    private Boolean premium;

    public User() {
    }

    public User(String nick, String email, String password, String confirmPassword, Boolean premium) {
        this.nick = nick;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.premium = premium;
    }

    public Long getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
