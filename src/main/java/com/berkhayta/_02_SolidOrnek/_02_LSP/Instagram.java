package com.berkhayta._02_SolidOrnek._02_LSP;

/*
 Instagram sınıfı içinde scaleRatio özelliğimiz/field olsun.
 ResizePhoto diye bir sınıfımız olsun. Bu sınıf içinde boyutlandırma yapacağız.
 Boyutlandırma yapacak metod bizden instagram nesnesi ve string type isteyecek.
 eğer bu type JPG-> scaleRatio = 18
 eğer bu type PNG-> scaleRatio = 20
 eğer bu type default-> scaleRatio = 30
 olmalı.
 */


import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

public class Instagram extends SocialMedia implements IEmailSendable,ISmsSendable,IPostable {


    @Override
    public void resize(String type) {
        switch (type){
            case "JPG":
                setScaleRatio(18);
                break;
            case "PNG":
                setScaleRatio(20);
                break;
            default:
                setScaleRatio(30);
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
    public void shareStory() {

    }

    @Override
    public void chat() {

    }
}
