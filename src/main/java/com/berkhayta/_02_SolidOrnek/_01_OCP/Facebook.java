package com.berkhayta._02_SolidOrnek._01_OCP;

public class Facebook extends  SocialMedia{
    @Override
    public void resize(String type) {
        switch (type){
            case "JPG":
                setScaleRatio(30);
                break;
            case "PNG":
                setScaleRatio(40);
                break;
            default:
                setScaleRatio(60);
        }
    }
}
