package com.tissue.domain.plan;

import com.tissue.domain.profile.User;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Topic implements Serializable {

    private String id;

    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;
    private Set<String> tags;

    private User user;

    private List<Plan> plans;

    private List<Post> posts;
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public Plan getActivePlan() {
        if(plans != null) {
            for(Plan plan : plans) {
                if(plan.isActive())
                    return plan;
            }
        }
        return null;
    }

    public List<Plan> getDeadPlans() {
        List<Plan> result = new ArrayList();

        if(plans != null) {
            for(Plan plan : plans) {
                if(!plan.isActive()) {
                    result.add(plan);
                }
            }
        }
        return result;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public long getPostsCount() {
        return posts.size();
    }
}
