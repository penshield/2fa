package com.penshield.enroller.dao;

import com.penshield.enroller.db.models.SupportedApplicationEO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by snouto on 30/05/16.
 */
@Component
@Scope("prototype")
public class SupportedApplicationDAO extends AbstractDAO<SupportedApplicationEO> {
    @Override
    public String getEntityName() {
        return "SupportedApplicationEO";
    }
}
