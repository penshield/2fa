package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="DefinedPolicies")
public class PolicyEO extends EntityEO implements Serializable {

    @Column(name="CreationDate",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name="XMLDefinition",nullable = false)
    private String xmlDefinition;


    @ManyToOne(targetEntity = CustomerEO.class)
    @JoinColumn(name="CustomerID",nullable = false)
    private CustomerEO customer;

    @ManyToOne(targetEntity = UserEO.class)
    @JoinColumn(name="UserID",nullable = false)
    private UserEO user;


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getXmlDefinition() {
        return xmlDefinition;
    }

    public void setXmlDefinition(String xmlDefinition) {
        this.xmlDefinition = xmlDefinition;
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
