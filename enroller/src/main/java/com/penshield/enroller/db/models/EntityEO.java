package com.penshield.enroller.db.models;

import com.penshield.enroller.db.utils.AnnotatingModel;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by snouto on 30/05/16.
 */

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class EntityEO implements Serializable , AnnotatingModel {


    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int Id;


    @Override
    public String getRowKey() {
        return null;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
