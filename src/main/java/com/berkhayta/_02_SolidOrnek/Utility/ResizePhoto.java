package com.berkhayta._02_SolidOrnek.Utility;

import com.berkhayta._02_SolidOrnek._01_OCP.Facebook;
import com.berkhayta._02_SolidOrnek._01_OCP.Instagram;
import com.berkhayta._02_SolidOrnek._01_OCP.SocialMedia;

public class ResizePhoto {
    public void resizePhoto(Instagram instagram,String type){
        switch (type){
            case "JPG":
                instagram.setScaleRatio(18);
                break;
            case "PNG":
                instagram.setScaleRatio(20);
                break;
            default:
                instagram.setScaleRatio(30);
                break;
        }
    }

    public void resizePhoto2(SocialMedia socialMedia, String type){
        switch (type){
            case "JPG":
                if(socialMedia instanceof Instagram)
                    socialMedia.setScaleRatio(18);
                else if(socialMedia instanceof Facebook)
                    socialMedia.setScaleRatio(30);
                break;
            case "PNG":
                if(socialMedia instanceof Instagram)
                    socialMedia.setScaleRatio(20);
                else if(socialMedia instanceof Facebook)
                    socialMedia.setScaleRatio(40);
                break;
            default:
                if(socialMedia instanceof Instagram)
                    socialMedia.setScaleRatio(30);
                else if(socialMedia instanceof Facebook)
                    socialMedia.setScaleRatio(60);
                break;
        }
    }

    public void resizePhoto3(SocialMedia socialMedia, String type) {
        socialMedia.resize(type);
    }
}
