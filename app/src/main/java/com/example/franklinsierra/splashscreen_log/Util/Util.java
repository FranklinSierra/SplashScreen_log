package com.example.franklinsierra.splashscreen_log.Util;

import android.content.SharedPreferences;

public class Util {

    public static String getUserEmailPreferences(SharedPreferences preferences){
        return preferences.getString("email","");
    }

    public static String getUserPasswordPreferences(SharedPreferences preferences){
        return preferences.getString("pass","");
    }
}
