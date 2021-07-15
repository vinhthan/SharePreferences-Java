package com.example.sharedpreferences;

import android.content.Context;

public class DataLocalManager {
    private static final String PREF_FIRST_INSTALL = "PREF_FIRST_INSTALL";
    private static final String PREF_STRING_VALUE = "PREF_STRING_VALUE";
    private static DataLocalManager instance;
    private MySharedPreference mySharedPreference;

    public static void init(Context context) {
        instance = new DataLocalManager();
        instance.mySharedPreference = new MySharedPreference(context);

    }

    public static DataLocalManager getInstance() {
        if (instance == null) {
            instance = new DataLocalManager();
        }
        return instance;
    }

    //
    public static void setFirstInstall(boolean isFirst) {
        DataLocalManager.getInstance().mySharedPreference.putBooleanValue(PREF_FIRST_INSTALL, isFirst);
    }
    public static boolean getFirstInstall(){
        return DataLocalManager.getInstance().mySharedPreference.getBooleanValue(PREF_FIRST_INSTALL);
    }

    public static void setStringValue(String value) {
        DataLocalManager.getInstance().mySharedPreference.putStringValue(PREF_STRING_VALUE, value);
    }
    public static String getStringValue(){
        return DataLocalManager.getInstance().mySharedPreference.getStringValue(PREF_STRING_VALUE);
    }


}
