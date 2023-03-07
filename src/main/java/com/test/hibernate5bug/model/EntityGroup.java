package com.test.hibernate5bug.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class EntityGroup extends EntityNode{

    /** The privilege application children for hierarchical privilege application (groups and privileges). */
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "parent_id")
    private Set<EntityNode> children;

    @Column(name = "groupName")
    private String groupName;

    public Set<EntityNode> getChildren() {
        return children;
    }

    public void setChildren(Set<EntityNode> children) {
        this.children = children;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
