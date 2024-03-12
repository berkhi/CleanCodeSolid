package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public abstract class Post {
    String title;
    String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public abstract String display();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
