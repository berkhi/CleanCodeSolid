package com.berkhayta._02_SolidOrnek.Utility;

public class NotificationService {
    public static void sendEmail(String email){
        System.out.println(email+ " adresine Email gönderildi.");
    }

    public static void sendSms(String tel){
        System.out.println(tel+ " numarasına Sms gönderildi.");
    }
}
