package com.example.myapplication.services;

import android.os.AsyncTask;

import com.example.myapplication.interfaces.UserDao;
import com.example.myapplication.interfacesAsync.OnUserRetrievedListener;
import com.example.myapplication.models.User;

public class GetUserAsync extends AsyncTask<Integer, Void, User> {
    private UserDao userDao;
    private OnUserRetrievedListener listener;
    public GetUserAsync(UserDao userDao,OnUserRetrievedListener listener) {
        this.userDao = userDao;
        this.listener = listener;
    }

    @Override
    public User doInBackground(Integer... userIds) {
        return userDao.getUserById(userIds[0].longValue());
    }
    @Override
    public void onPostExecute(User user) {
        super.onPostExecute(user);
        if (listener != null) {
            listener.onUserRetrieved(user);
        }
    }

}

