package com.example.myapplication;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapplication.data.AppDatabase;
import com.example.myapplication.data.AppDatabaseBuilder;

public class App extends Application {
    public static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = AppDatabaseBuilder.getInstance(getApplicationContext());
        //Context context = getApplicationContext();
        //context.deleteDatabase("word_note_database");

        //database = Room.databaseBuilder(getApplicationContext(),
          //      AppDatabase.class, "word_note_database").build();
    }
}

