package com.tissue.domain.plan;

import com.tissue.domain.profile.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PostMessage extends ContentParent {

    private Post post;
    private List<PostMessageComment> comments;

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
