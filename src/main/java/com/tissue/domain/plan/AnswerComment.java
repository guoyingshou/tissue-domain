package com.tissue.domain.plan;

public class AnswerComment extends ContentParent {

    private Answer answer;

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }
}
