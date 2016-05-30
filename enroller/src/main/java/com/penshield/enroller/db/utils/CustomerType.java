package com.penshield.enroller.db.utils;

/**
 * Created by snouto on 30/05/16.
 */
public enum CustomerType {

    INDIVIDUAL(0) ,MEDSIZE(1) , ENTERPRISE(2);


    private int type;

    CustomerType(int custType){
        this.type = custType;
    }
}
