package com.tissue.domain.plan;

import java.util.List;

public class Question extends Post {

    private List<QuestionComment> comments;
    private List<Answer> answers;

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
