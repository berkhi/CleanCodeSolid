package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public class LinkedinPost extends Post implements IPostFoto {

    public LinkedinPost(String title, String content) {
        super(title, content);
    }

    @Override
    public String display() {
        return "LinkedinPost \n Title:"+title+ "\nContent:"+content;
    }

    @Override
    public void postFoto(String FotoUrl) {

    }
}
