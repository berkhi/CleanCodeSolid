package com.berkhayta._02_SolidOrnek._03_ISP;

import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

public class Whatsapp extends SocialMedia implements IEmailSendable, ISmsSendable, IVideoConferanceble,IStorySharable {
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
    public void sharePhoto() {

    }

    @Override
    public void shareStory() {

    }

    @Override
    public void chat() {

    }

    @Override
    public void videoConferance() {

    }
}
