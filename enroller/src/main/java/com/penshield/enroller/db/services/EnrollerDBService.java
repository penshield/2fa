package com.penshield.enroller.db.services;

import com.penshield.enroller.dao.CustomerDAO;
import com.penshield.enroller.dao.RoleDAO;
import com.penshield.enroller.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by snouto on 30/05/16.
 */
@Component("EnrollerDBService")
@Scope("prototype")
public class EnrollerDBService {

    @Autowired
    private CustomerDAO customerManager;

    @Autowired
    private RoleDAO roleManager;

    @Autowired
    private UserDAO userManager;

    public CustomerDAO getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(CustomerDAO customerManager) {
        this.customerManager = customerManager;
    }

    public RoleDAO getRoleManager() {
        return roleManager;
    }

    public void setRoleManager(RoleDAO roleManager) {
        this.roleManager = roleManager;
    }

    public UserDAO getUserManager() {
        return userManager;
    }

    public void setUserManager(UserDAO userManager) {
        this.userManager = userManager;
    }
}
