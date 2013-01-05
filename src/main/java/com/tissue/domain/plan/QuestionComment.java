package com.tissue.domain.plan;

public class QuestionComment extends Parent {

    private Post question;

    public void setQuestion(Post question) {
        this.question = question;
    }

    public Post getQuestion() {
        return question;
    }
}
