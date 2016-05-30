package com.penshield.enroller.db.models;

import com.penshield.enroller.db.utils.CustomerType;

import javax.persistence.*;

/**
 * Created by snouto on 30/05/16.
 */

@Entity
@Table(name = "Customer")
public class CustomerEO extends EntityEO {

    @Column(name = "FirstName",nullable = false)
    private String firstName;

    @Column(name="LastName",nullable = false)
    private String lastName;

    @Column(name="Email",nullable = false)
    private String emailAddress;

    @Column(name="Type",nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private CustomerType type;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
