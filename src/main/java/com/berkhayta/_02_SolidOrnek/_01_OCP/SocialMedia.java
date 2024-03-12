package com.berkhayta._02_SolidOrnek._01_OCP;

import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

public abstract class SocialMedia {
    private double scaleRatio;

    public double getScaleRatio() {
        return scaleRatio;
    }

    public void setScaleRatio(double scaleRatio) {
        this.scaleRatio = scaleRatio;
    }

    public void sendNotification(User user){
        sendTelNotification(user);
        sendEmailNotification(user);
    }

    public void sendTelNotification(User user){
        if(hasTel(user)){
            NotificationService.sendSms(user.getTel());
        }
    }
    public void sendEmailNotification(User user){
        if(hasMail(user)){
            NotificationService.sendEmail(user.getEmail());
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
//abstract metod ekledik!
    public abstract void resize(String type);
}
