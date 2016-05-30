package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="ProtectedApplications")
public class ProtectedApplicationEO extends EntityEO implements Serializable {

    @Column(name="IntegrationKey",nullable = false)
    private String integrationKey;
    @Column(name="SecretKey",nullable = false)
    private String secretKey;
    @Column(name="ContactServerURL",nullable = false)
    private String contactServerUrl;
    @Column(name="active")
    private boolean active;

    @ManyToOne(targetEntity = CustomerEO.class)
    @JoinColumn(name="CustomerID",nullable = false)
    private CustomerEO customer;
    @ManyToOne(targetEntity = UserEO.class)
    @JoinColumn(name="UserID",nullable = false)
    private UserEO user;

    public String getIntegrationKey() {
        return integrationKey;
    }

    public void setIntegrationKey(String integrationKey) {
        this.integrationKey = integrationKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getContactServerUrl() {
        return contactServerUrl;
    }

    public void setContactServerUrl(String contactServerUrl) {
        this.contactServerUrl = contactServerUrl;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CustomerEO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEO customer) {
        this.customer = customer;
    }

    public UserEO getUser() {
        return user;
    }

    public void setUser(UserEO user) {
        this.user = user;
    }
}
