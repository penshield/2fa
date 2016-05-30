package com.penshield.enroller.db.services;

import com.penshield.enroller.dao.*;
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

    @Autowired
    private ApplicationPolicyDAO applicationPolicyManager;

    @Autowired
    private EndpointDAO endpointManager;

    @Autowired
    private GroupDAO groupManager;

    @Autowired
    private GroupPolicyDAO groupPolicyManager;

    @Autowired
    private PolicyDAO policyManager;

    @Autowired
    private ProtectedApplicationDAO protectedApplicationManager;

    @Autowired
    private SupportedApplicationDAO supportedApplicationManager;

    @Autowired
    private UserGroupDAO userGroupManager;

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

    public ApplicationPolicyDAO getApplicationPolicyManager() {
        return applicationPolicyManager;
    }

    public void setApplicationPolicyManager(ApplicationPolicyDAO applicationPolicyManager) {
        this.applicationPolicyManager = applicationPolicyManager;
    }

    public EndpointDAO getEndpointManager() {
        return endpointManager;
    }

    public void setEndpointManager(EndpointDAO endpointManager) {
        this.endpointManager = endpointManager;
    }

    public GroupDAO getGroupManager() {
        return groupManager;
    }

    public void setGroupManager(GroupDAO groupManager) {
        this.groupManager = groupManager;
    }

    public GroupPolicyDAO getGroupPolicyManager() {
        return groupPolicyManager;
    }

    public void setGroupPolicyManager(GroupPolicyDAO groupPolicyManager) {
        this.groupPolicyManager = groupPolicyManager;
    }

    public PolicyDAO getPolicyManager() {
        return policyManager;
    }

    public void setPolicyManager(PolicyDAO policyManager) {
        this.policyManager = policyManager;
    }

    public ProtectedApplicationDAO getProtectedApplicationManager() {
        return protectedApplicationManager;
    }

    public void setProtectedApplicationManager(ProtectedApplicationDAO protectedApplicationManager) {
        this.protectedApplicationManager = protectedApplicationManager;
    }

    public SupportedApplicationDAO getSupportedApplicationManager() {
        return supportedApplicationManager;
    }

    public void setSupportedApplicationManager(SupportedApplicationDAO supportedApplicationManager) {
        this.supportedApplicationManager = supportedApplicationManager;
    }

    public UserGroupDAO getUserGroupManager() {
        return userGroupManager;
    }

    public void setUserGroupManager(UserGroupDAO userGroupManager) {
        this.userGroupManager = userGroupManager;
    }
}
