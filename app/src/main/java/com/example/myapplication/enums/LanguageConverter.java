package com.example.myapplication.enums;

import androidx.room.TypeConverter;

public class LanguageConverter {
    @TypeConverter
    public static Language fromStringToLanguage(String value) {
        return value == null ? null : Language.valueOf(value);
    }
    @TypeConverter
    public static Language fromIntToLanguage(int value) {
        return value < 0  ? null : Language.values()[value];
    }
    @TypeConverter
    public static int toInteger(Language language) {
        return language == null ? -1 : language.ordinal();
    }
    @TypeConverter
    public static String toString(Language language) {
        return language == null ? null : language.name();
    }
}
