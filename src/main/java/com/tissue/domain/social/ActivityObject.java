package com.tissue.domain.social;

import java.io.Serializable;

public class ActivityObject implements Serializable {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
