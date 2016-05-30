package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="EndPoints")
public class EndpointEO extends EntityEO implements Serializable {

    @Column(name="Type")
    private String type;
    @Column(name="OS")
    private String os;
    @Column(name="Browsers")
    private String browsers;
    @Column(name="SecurityWarnings")
    private String securityWarnings;
    @Column(name="LastUsed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUsed;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = UserEO.class)
    @JoinColumn(name = "UserID",nullable = false)
    private UserEO user;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowsers() {
        return browsers;
    }

    public void setBrowsers(String browsers) {
        this.browsers = browsers;
    }

    public String getSecurityWarnings() {
        return securityWarnings;
    }

    public void setSecurityWarnings(String securityWarnings) {
        this.securityWarnings = securityWarnings;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }

    public UserEO getUser() {
        return user;
    }

    public void setUser(UserEO user) {
        this.user = user;
    }
}
