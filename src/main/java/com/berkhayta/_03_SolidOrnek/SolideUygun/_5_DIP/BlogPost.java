package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public class BlogPost extends Post implements IPostText {
    public BlogPost(String title, String content) {
        super(title, content);
    }

    @Override
    public String display() {
        return "BlogPost \n Title:"+title+ "\nContent:"+content;
    }

    @Override
    public void postText(String text) {

    }
}

