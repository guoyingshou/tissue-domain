package com.tissue.domain.plan;

import java.util.List;

public class Post extends ContentParent {

    private Boolean closed = false;

    private String type;

    private Plan plan;

    /**
    private List<PostMessage> messages;

    private List<QuestionComment> comments;
    private List<Answer> answers;
    */

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean isClosed() {
        return closed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    /**
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
    */

}
