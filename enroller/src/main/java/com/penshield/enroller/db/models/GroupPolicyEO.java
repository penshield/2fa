package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="GroupsPolicies")
public class GroupPolicyEO extends EntityEO implements Serializable {

    @Column(name="active")
    private boolean active;

    @ManyToOne(targetEntity = GroupEO.class)
    @JoinColumn(name="GroupsID",nullable = false)
    private GroupEO group;

    @ManyToOne(targetEntity = PolicyEO.class)
    @JoinColumn(name="DefinedPolicyID",nullable = false)
    private PolicyEO policy;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public GroupEO getGroup() {
        return group;
    }

    public void setGroup(GroupEO group) {
        this.group = group;
    }

    public PolicyEO getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEO policy) {
        this.policy = policy;
    }
}
