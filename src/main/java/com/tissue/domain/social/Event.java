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

    protected ActivityObject object;

    protected ActivityObject target;

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

     public void setObject(ActivityObject object) {
         this.object = object;
     }

     public ActivityObject getObject() {
         return object;
     }

     public void setTarget(ActivityObject target) {
         this.target = target;
     }

     public ActivityObject getTarget() {
         return target;
     }

     public List getMessageArgs() {
         List args = new ArrayList();
         /**
         args.add(actor.getId());
         args.add(actor.getDisplayName());

         args.add(object.getId());
         args.add(object.getTitle());

         args.add(target.getId());
         args.add(target.getTitle());

         DateTime dt = new DateTime(published);
         DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
         args.add(dtf.print(dt));
         */

         return args;
     }

}
