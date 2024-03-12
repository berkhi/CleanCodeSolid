package com.berkhayta._02_SolidOrnek._00_SRP;

import com.berkhayta._02_SolidOrnek.Utility.User;

public class Runner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        User user1=new User("Berk");
        User user2=new User("Mustafa","mustafa@gmail.com");
        User user3=new User("Ali","ali@gmail.com","5554443322");
        User user4=new User("Berk");
        user4.setTel("5551112233");

        instagram.sendTelNotification(user1);
        instagram.sendTelNotification(user2);
        instagram.sendTelNotification(user3);
        instagram.sendTelNotification(user4);

        instagram.sendEmailNotification(user1);
        instagram.sendEmailNotification(user2);
        instagram.sendEmailNotification(user3);
        instagram.sendEmailNotification(user4);
        System.out.println("-----------------");
        instagram.sendNotification(user1);
        instagram.sendNotification(user2);
        instagram.sendNotification(user3);
        instagram.sendNotification(user4);


    }
}
