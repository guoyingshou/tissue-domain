package com.tissue.domain.plan;

/**
import com.tissue.domain.profile.User;

import java.io.Serializable;
import java.util.Date;
*/

public class AnswerComment extends Parent {

    /**
    private String id;

    private String content;
    private Date createTime;
    private Date updateTime;

    private User user;
    */
    private Answer answer;

    /**
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
    */

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }
}
