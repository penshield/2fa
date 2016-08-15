package com.penshield.enroller.db.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="Roles")
public class RoleEO extends EntityEO implements Serializable,GrantedAuthority {

    @Column(name="RoleName",nullable = false)
    private String roleName;
    @Column(name="DisplayName",nullable = false)
    private String displayName;


    public RoleEO(){}

    public RoleEO(String name , String display){
        this.roleName = name;
        this.displayName = display;
    }


    public String getAuthority() {


        return this.getRoleName();

    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
