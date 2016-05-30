package com.penshield.enroller.dao;

import com.penshield.enroller.db.models.GroupEO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by snouto on 30/05/16.
 */
@Component
@Scope("prototype")
public class GroupDAO extends AbstractDAO<GroupEO> {
    @Override
    public String getEntityName() {

        return "GroupEO";
    }
}
