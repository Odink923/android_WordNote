package com.example.myapplication.data;

import android.content.Context;

import androidx.room.Room;

public class AppDatabaseBuilder {
    private static final String DB_NAME = "word_note_database";
    private static AppDatabase instance;

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DB_NAME)
                    .build();
        }
        return instance;
    }
}
