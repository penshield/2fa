package com.penshield.enroller.dao;

import com.penshield.enroller.db.models.CustomerEO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by snouto on 30/05/16.
 */
@Component("CustomerDAO")
@Scope("prototype")
public class CustomerDAO extends AbstractDAO<CustomerEO> {


    @Override
    public String getEntityName() {
        return "CustomerEO";
    }
}
