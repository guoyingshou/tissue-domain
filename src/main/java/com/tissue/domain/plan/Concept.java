package com.tissue.domain.plan;

import java.util.List;

public class Concept extends Post {

    private List<PostMessage> messages;

    public void setMessages(List<PostMessage> messages) {
        this.messages = messages;
    }

    public List<PostMessage> getMessages() {
        return messages;
    }

}
