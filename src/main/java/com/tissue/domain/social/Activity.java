package com.tissue.domain.social;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    private String type;

    private String title;
    private String verb;
    private Date published;

    private ActivityObject actor;
    private ActivityObject object;
    private ActivityObject target;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getVerb() {
        return verb;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getPublished() {
        return published;
    }

    public void setActor(ActivityObject actor) {
        this.actor = actor;
    }

    public ActivityObject getActor() {
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

}
