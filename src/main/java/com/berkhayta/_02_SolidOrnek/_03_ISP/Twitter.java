package com.berkhayta._02_SolidOrnek._03_ISP;

import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

public class Twitter extends SocialMedia implements IEmailSendable, ISmsSendable, IPostable {
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

    @Override
    public void sendEmail(User user) {
        if(hasMail(user)){
            NotificationService.sendEmail(user.getEmail());
        }
    }

    @Override
    public void sendSms(User user) {
        if(hasTel(user)){
            NotificationService.sendSms(user.getTel());
        }
    }
    public boolean hasMail(User user){
        if(user.getEmail()!=null){
            return true;
        }
        return false;
    }
    public boolean hasTel(User user){
        if(user.getTel()!=null){
            return true;
        }
        return false;
    }

    @Override
    public void sharePost() {

    }

    @Override
    public void sharePhoto() {

    }



    @Override
    public void chat() {

    }
}
