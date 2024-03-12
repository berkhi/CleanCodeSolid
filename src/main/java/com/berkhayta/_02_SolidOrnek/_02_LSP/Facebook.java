package com.berkhayta._02_SolidOrnek._02_LSP;
// Facebook artık sms ile bildirim göndermeyi desteklemiyorum.

//Facebook: sharePost, Chat, sharePhoto, shareStory
import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

public class Facebook extends SocialMedia implements IEmailSendable, IPostable {
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

    @Override
    public void sendEmail(User user) {
        if(hasTel(user)){
            NotificationService.sendSms(user.getTel());
        }
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
