package com.example.myapplication.enums;

import androidx.room.TypeConverter;

public class AccessConverter {
    @TypeConverter
    public static Access fromStringToAccess(String value) {
        return value == null ? null : Access.valueOf(value);
    }
    @TypeConverter
    public static Access fromIntToAccess(int value) {
        return value < 0  ? null : Access.values()[value];
    }
    @TypeConverter
    public static int toInteger(Access access) {
        return access == null ? -1 : access.ordinal();
    }
    @TypeConverter
    public static String toString(Access access) {
        return access == null ? null : access.name();
    }
}
