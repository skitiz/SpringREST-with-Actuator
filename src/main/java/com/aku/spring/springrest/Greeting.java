package com.aku.spring.springrest;

import org.springframework.stereotype.Controller;

public class Greeting {
    private long id;
    private String content;

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
