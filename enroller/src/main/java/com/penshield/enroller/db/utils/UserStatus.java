package com.penshield.enroller.db.utils;

/**
 * Created by snouto on 30/05/16.
 */
public enum UserStatus {


    DISABLED(0),ENABLED(1);

    private int statusCode;
    UserStatus(int code)
    {
        this.statusCode = code;
    }


    public boolean asBoolean(){

        if(this.statusCode == 0) return false;
        else return true;
    }



}
