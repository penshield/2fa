package com.penshield.enroller.db.models;

import com.penshield.enroller.db.utils.UserStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by snouto on 30/05/16.
 */
@Entity
@Table(name="Users")
public class UserEO extends EntityEO implements Serializable , UserDetails {


    @Column(name="UserName",nullable = false)
    private String userName;
    @Column(name="EmailAddress",nullable = false)
    private String emailAddress;
    @Column(name="mobile",nullable = false)
    private String mobile;
    @Column(name="RealName",nullable = false)
    private String realName;

    @Column(name="status")
    @Enumerated(value = EnumType.ORDINAL)
    private UserStatus status;

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = RoleEO.class)
    @JoinColumn(name ="RoleID",nullable = false)
    private RoleEO role;

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = CustomerEO.class)
    @JoinColumn(name="CustomerID",nullable = false)
    private CustomerEO customer;


    @Column(name="Password",nullable = false)
    private String password;


    public UserEO(){}

    public UserEO(String username,String password , String email , String mobile , String displayName , UserStatus status, RoleEO role , CustomerEO customer)
    {
        this.userName = username;
        this.password = password;
        this.emailAddress = email;
        this.mobile = mobile;
        this.realName = displayName;
        this.status = status;
        this.role = role;
        this.customer = customer;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public RoleEO getRole() {
        return role;
    }

    public void setRole(RoleEO role) {
        this.role = role;
    }

    public CustomerEO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEO customer) {
        this.customer = customer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(this.getRole());

        return authorities;
    }

    @Override
    public String getPassword() {
        return  this.password;

    }

    @Override
    public String getUsername() {
        return this.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {

        return this.getStatus().asBoolean();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.getStatus().asBoolean();
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
