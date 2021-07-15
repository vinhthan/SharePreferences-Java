package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    private static final String MY_SHARE_PREFERENCES = "MY_SHARE_PREFERENCES";

    private Context context;

    public MySharedPreference(Context context) {
        this.context = context;
    }

    public void putBooleanValue(String key, boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARE_PREFERENCES, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBooleanValue(String key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARE_PREFERENCES, context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, false);
    }

    public void putStringValue(String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARE_PREFERENCES, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getStringValue(String key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARE_PREFERENCES, context.MODE_PRIVATE);
        return sharedPreferences.getString(key, "");
    }

}
