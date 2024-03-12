package com.berkhayta._02_SolidOrnek._01_OCP;

public class Twitter extends SocialMedia{
    @Override
    public void resize(String type) {
        switch (type){
            case "JPG":
                setScaleRatio(Constant.TWITTER_JPG_RATIO);
                break;
            case "PNG":
                setScaleRatio(Constant.TWITTER_PNG_RATIO);
                break;
            default:
                setScaleRatio(7);
        }
    }
}
