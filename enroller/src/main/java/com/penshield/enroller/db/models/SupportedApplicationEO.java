package com.penshield.enroller.db.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="SupportedApplications")
public class SupportedApplicationEO extends EntityEO implements Serializable {

    @Column(name="ApplicationName",nullable = false)
    private String applicationName;
    @Column(name="DisplayName",nullable = false)
    private String displayName;
    @Column(name="Description")
    private String description;
    @Column(name="Features")
    private String features;

    @Column(name="CreationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
