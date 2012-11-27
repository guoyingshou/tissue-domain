package com.tissue.domain.plan;

import com.tissue.domain.profile.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PostMessage implements Serializable {

    private String id;
    private String content;
    private Date createTime;
    private Date updateTime;

    private User user;
    private Post post;
    private List<PostMessageComment> comments;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void setComments(List<PostMessageComment> comments) {
        this.comments = comments;
    }

    public List<PostMessageComment> getComments() {
        return comments;
    }
}
