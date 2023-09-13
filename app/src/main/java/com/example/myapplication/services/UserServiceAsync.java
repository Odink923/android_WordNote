package com.example.myapplication.services;

import android.os.AsyncTask;

import com.example.myapplication.interfaces.UserDao;
import com.example.myapplication.models.User;

public class UserServiceAsync extends AsyncTask<User, Void, Void> {
    private UserDao userDao;

    public UserServiceAsync(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    protected Void doInBackground(User... users) {
        userDao.insert(users[0]);
        return null;
    }
}
