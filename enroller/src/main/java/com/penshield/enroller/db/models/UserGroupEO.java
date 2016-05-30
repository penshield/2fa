package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="UserGroups")
public class UserGroupEO extends EntityEO implements Serializable {

    @Column(name="IsActive")
    private boolean active;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = UserEO.class)
    @JoinColumn(name="UserID",nullable = false)
    private UserEO user;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = GroupEO.class)
    @JoinColumn(name="GroupID",nullable = false)
    private GroupEO group;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserEO getUser() {
        return user;
    }

    public void setUser(UserEO user) {
        this.user = user;
    }

    public GroupEO getGroup() {
        return group;
    }

    public void setGroup(GroupEO group) {
        this.group = group;
    }
}
