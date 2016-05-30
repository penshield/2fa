package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */

@Entity
@Table(name="Groups")
public class GroupEO extends EntityEO implements Serializable {

    @Column(name="GroupName",nullable = false)
    private String groupName;
    @Column(name="GroupDescription",nullable = false)
    private String groupDescription;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = CustomerEO.class)
    @JoinColumn(name="CustomerID",nullable = false)
    private CustomerEO customer;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public CustomerEO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEO customer) {
        this.customer = customer;
    }
}
