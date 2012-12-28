package com.tissue.domain.social;

import com.tissue.domain.profile.User;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

public class Event implements Serializable {
    protected String id;

    protected Date published;
    protected String type;
    protected User actor;

    protected Map object;

    protected Map target;

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

     public List getMessageArgs() {
         List args = new ArrayList();
         args.add(actor.getId());
         args.add(actor.getDisplayName());

         args.add(object.get("id"));
         args.add(object.get("title"));

         args.add(target.get("id"));
         args.add(target.get("title"));

         DateTime dt = new DateTime(published);
         DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
         args.add(dtf.print(dt));

         return args;
     }

}
