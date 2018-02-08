package com.example.vytautas.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Vytautas on 31/01/2018.
 */

public class User {
    private String username;
    private String password;
    private String email;
    private static final String PREFERENCES_FILE_NAME = "com.example.vytautas.myapplication";
    private static final String USERNAME_KEY = "username";
    private static final String PASSWORD_KEY = "login_et_password";
    private static final String REMEMBER_ME_KEY = "rememberMe";

    private SharedPreferences sharedPreferences;

    //skirtas registracijai (RegisterActivity)
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //konstruktorius skirtas loginui
    public User(Context context) {
        this.sharedPreferences = context.getSharedPreferences(User.PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
    }

    //Skirti loginui (MainActivity)

    public void setUsernameForLogin(String username) {
        this.sharedPreferences.edit().putString(USERNAME_KEY, username).apply();
    }

    public String getUsernameForLogin() {
        return this.sharedPreferences.getString(USERNAME_KEY, "");
    }

    public void setPasswordForLogin(String password) {
        this.sharedPreferences.edit().putString(PASSWORD_KEY, password).apply();
    }

    public String getPasswordForLogin() {
        return this.sharedPreferences.getString(PASSWORD_KEY, "");
    }


    public void setRememberMeKeyForLogin(boolean rememberMe) {
        this.sharedPreferences.edit().putBoolean(REMEMBER_ME_KEY, rememberMe).apply();
    }

    public boolean isRememberedForLogin() {
        return this.sharedPreferences.getBoolean(REMEMBER_ME_KEY, false);
    }

    //skirti registracijai (RegisterActivity)
    public String getUsernameForRegister() {
        return username;
    }

    public String getPasswordForRegister() {
        return password;
    }

    public String getEmailForRegister() {
        return email;
    }

    public void setUsernameForRegister(String username) {
        this.username = username;
    }

    public void setPasswordForRegister(String password) {
        this.password = password;
    }

    public void setEmailForRegister(String email) {
        this.email = email;
    }
}


