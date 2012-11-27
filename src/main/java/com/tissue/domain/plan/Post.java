package com.tissue.domain.plan;

import com.tissue.domain.profile.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Post implements Serializable {

    private String id;

    private String title;
    private String content;
    private Date createTime;

    private Boolean closed = false;

    /**
     * concept, note, tutorial or question.
     */
    private String type;

    private User user;
    private Plan plan;

    private List<PostMessage> messages;

    private List<QuestionComment> comments;
    private List<Answer> answers;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean isClosed() {
        return closed;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    //field avaible for concept, note or tutorial
    public void setMessages(List<PostMessage> messages) {
        this.messages = messages;
    }

    public List<PostMessage> getMessages() {
        return messages;
    }

    //fields availabe for question only
    public void setComments(List<QuestionComment> comments) {
        this.comments = comments;
    }

    public List<QuestionComment> getComments() {
        return comments;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

}
