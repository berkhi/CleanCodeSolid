package com.berkhayta._03_SolidOrnek.SolideUygun._1_SRP;

class BlogPost {
    String title;
    String content;

    public BlogPost(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

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

