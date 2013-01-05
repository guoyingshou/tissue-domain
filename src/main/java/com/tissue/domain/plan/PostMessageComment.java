package com.tissue.domain.plan;

public class PostMessageComment extends Parent {

    private PostMessage message;

    public void setPostMessage(PostMessage message) {
        this.message = message;
    }

    public PostMessage getPostMessage() {
        return message;
    }
}
