package com.tissue.domain.social;

import com.tissue.domain.profile.User;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.List;

public class Event implements Serializable {
    private String id;

    private Date published;
    private String type;
    private User actor;

    private Map object;
    private Map target;

    List<User> notifies;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getPublished() {
        return published;
    }

    public void setType(String type) {
        this.type = type;
    }

     public String getType() {
         return type;
     }

     public void setActor(User actor) {
         this.actor = actor;
     }

     public User getActor() {
         return actor;
     }

     public void setObject(Map object) {
         this.object = object;
     }

     public Map getObject() {
         return object;
     }

     public void setTarget(Map target) {
         this.target = target;
     }

     public Map getTarget() {
         return target;
     }

     public void setNotifies(List<User> notifies) {
         this.notifies = notifies;
     }

     public List<User> getNotifies() {
         return notifies;
     }

}
