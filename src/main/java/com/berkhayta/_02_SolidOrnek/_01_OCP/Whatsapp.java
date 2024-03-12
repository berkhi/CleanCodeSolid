package com.berkhayta._02_SolidOrnek._01_OCP;

public class Whatsapp extends SocialMedia{
    @Override
    public void resize(String type) {
        switch (type){
            case "JPG":
                setScaleRatio(25);
                break;
            case "PNG":
                setScaleRatio(35);
                break;
            default:
                setScaleRatio(45);
        }
    }
}
