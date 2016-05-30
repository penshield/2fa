package com.penshield.enroller.web.bootstrap;

import com.penshield.enroller.db.models.CustomerEO;
import com.penshield.enroller.db.models.RoleEO;
import com.penshield.enroller.db.models.UserEO;
import com.penshield.enroller.db.services.EnrollerDBService;
import com.penshield.enroller.db.utils.CustomerType;
import com.penshield.enroller.db.utils.UserStatus;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by snouto on 30/05/16.
 */
@Component
public class EnrollerBootStrap implements ApplicationContextAware, InitializingBean {



    private ApplicationContext context;


    @Autowired
    protected EnrollerDBService enrollerService;


    @Override
    public void afterPropertiesSet() throws Exception {

        if(enrollerService != null){




        }

    }

    private void createUsers(){

        RoleEO employeeRole = enrollerService.getRoleManager().getEntity(1);
        CustomerEO customer = enrollerService.getCustomerManager().getEntity(1);
        UserEO[] users = new UserEO[2];


        users[0] = new UserEO("snouto","snouto","snouto@gmail.com","0537064873","Mohamed Ibrahim", UserStatus.ENABLED,employeeRole,customer);
        users[1] = new UserEO("serene","serene","serene@gmail.com","0562445611","Serene Mohamed Fawzy",UserStatus.ENABLED,employeeRole,customer);


        for(int i=0;i<users.length;i++){

            enrollerService.getUserManager().addEntity(users[i]);
        }

        System.out.println("Users have been saved");

    }


    private void addRoles(){

        RoleEO[] someRoles =new RoleEO[3];
        someRoles[0] = new RoleEO("SUPER-USER","Super User");
        someRoles[1] = new RoleEO("ADMINISTRATOR","Administrator");
        someRoles[2] = new RoleEO("EMPLOYEE","Employee");

        for(int i = 0 ; i < someRoles.length;i++){

            enrollerService.getRoleManager().addEntity(someRoles[i]);
        }


        //Output the result
        System.out.println("Roles have been created.");
    }


    private void createCustomer(){

        //Create one customer
        CustomerEO customer = new CustomerEO();
        customer.setEmailAddress("ceo@penshield.com");
        customer.setFirstName("PenShield Inc.");
        customer.setLastName(" Company");
        customer.setType(CustomerType.ENTERPRISE);
        //now create the customer
        enrollerService.getCustomerManager().addEntity(customer);
        System.out.println("Customer has been created");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.context = applicationContext;
    }



}
