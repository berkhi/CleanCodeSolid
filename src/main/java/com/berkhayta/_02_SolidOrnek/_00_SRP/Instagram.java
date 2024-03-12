package com.berkhayta._02_SolidOrnek._00_SRP;

import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

/*
 1. Adım: Bir bildirim gönderme metodumuz olmalı.
 Bu metod kullanıcının emaili varsa email,
 telefon bilgisi varsa sms,
 her 2si de var her 2sini de göndermeli.
 Sorun: sendNotification metodu 2 farklı işlem yapmakta. Hem email kontrolü ve göndermesi,
  hem tel no kontrolü ve sms gönderme işlemi yapıyor. Bu SRP'ye uygun değildir.
 Çözüm: İşlemi farklı metodlara bölebiliriz.

 */
public class Instagram {

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
}
