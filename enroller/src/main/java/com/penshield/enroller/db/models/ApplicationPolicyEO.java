package com.penshield.enroller.db.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="ApplicationPolicies")
public class ApplicationPolicyEO extends EntityEO implements Serializable {

    @ManyToOne(targetEntity = ProtectedApplicationEO.class)
    @JoinColumn(name="ProtectedApplicationsID",nullable = false)
    private ProtectedApplicationEO protectedApplication;

    @ManyToOne(targetEntity = PolicyEO.class)
    @JoinColumn(name="DefinedPolicyID",nullable = false)
    private PolicyEO definedPolicy;

    @Column(name="active")
    private boolean active;

    public ProtectedApplicationEO getProtectedApplication() {
        return protectedApplication;
    }

    public void setProtectedApplication(ProtectedApplicationEO protectedApplication) {
        this.protectedApplication = protectedApplication;
    }

    public PolicyEO getDefinedPolicy() {
        return definedPolicy;
    }

    public void setDefinedPolicy(PolicyEO definedPolicy) {
        this.definedPolicy = definedPolicy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
