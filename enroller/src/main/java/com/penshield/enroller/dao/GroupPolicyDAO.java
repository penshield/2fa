package com.penshield.enroller.dao;
import com.penshield.enroller.db.models.GroupPolicyEO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by snouto on 30/05/16.
 */
@Component
@Scope("prototype")
public class GroupPolicyDAO  extends AbstractDAO<GroupPolicyEO>{
    @Override
    public String getEntityName() {

        return "GroupPolicyEO";
    }
}
