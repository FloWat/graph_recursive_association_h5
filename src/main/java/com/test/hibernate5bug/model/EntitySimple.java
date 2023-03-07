package com.test.hibernate5bug.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EntitySimple extends EntityNode{

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
