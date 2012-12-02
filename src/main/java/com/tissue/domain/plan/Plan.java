package com.tissue.domain.plan;

import com.tissue.domain.profile.User;

import org.joda.time.DateTime;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Plan implements Serializable {

    private String id;

    private Integer duration;
    private Date createTime;

    private User user;
    private Topic topic;

    private List<User> members;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<User> getMembers() {
        if(members == null) {
            members = new ArrayList();
        }
        return members;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }

    public Boolean isOwnerOrMember(String userId) {
        if(userId.equals(this.user.getId())) {
            return true;
        }

        if(members != null) {
            for(User user : members) {
                if(userId.equals(user.getId())) {
                    return true;
                }
            }
        }

        return false;
    }

    public Boolean isActive() {
        DateTime dt = new DateTime(this.createTime).plusMonths(this.duration);
        if(dt.isAfterNow()) {
            return true;
        }
        return false;
    }
}
