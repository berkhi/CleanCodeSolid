package com.berkhayta._02_SolidOrnek._01_OCP;

import com.berkhayta._02_SolidOrnek.Utility.ResizePhoto;
/* Bir sosyal medya uygulaması daha ekleniyor.  Facebook:
eğer bu type JPG-> scaleRatio = 30
eğer bu type PNG-> scaleRatio = 40
eğer bu type default-> scaleRatio = 60
*/

/*
Soru 3:
Bir sosyal medya uygulaması daha ekleniyor.  Whatsapp:
eğer bu type JPG-> scaleRatio = 25
eğer bu type PNG-> scaleRatio = 35
eğer bu type default-> scaleRatio = 45
 */

public class Runner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        Facebook facebook=new Facebook();
        Whatsapp whatsapp=new Whatsapp();
        Twitter twitter=new Twitter();
        ResizePhoto resizePhoto=new ResizePhoto();

        System.out.println("instagram==>"+instagram.getScaleRatio());
        resizePhoto.resizePhoto2(instagram,"JPG");
        System.out.println("instagram==>"+instagram.getScaleRatio());
        resizePhoto.resizePhoto2(instagram,"PNG");
        System.out.println("instagram==>"+instagram.getScaleRatio());
        resizePhoto.resizePhoto2(instagram,"GIF");
        System.out.println("instagram==>"+instagram.getScaleRatio());

        System.out.println("facebook==>"+facebook.getScaleRatio());
        resizePhoto.resizePhoto2(facebook,"JPG");
        System.out.println("facebook==>"+facebook.getScaleRatio());
        resizePhoto.resizePhoto2(facebook,"PNG");
        System.out.println("facebook==>"+facebook.getScaleRatio());
        resizePhoto.resizePhoto2(facebook,"GIF");
        System.out.println("facebook==>"+facebook.getScaleRatio());

        resizePhoto.resizePhoto2(whatsapp,"GIF");
        System.out.println("whatsapp==>"+whatsapp.getScaleRatio());

        resizePhoto.resizePhoto3(whatsapp,"GIF");
        System.out.println("whatsapp==>"+whatsapp.getScaleRatio());


        System.out.println("facebook==>"+facebook.getScaleRatio());
        resizePhoto.resizePhoto3(facebook,"JPG");
        System.out.println("facebook==>"+facebook.getScaleRatio());
        resizePhoto.resizePhoto3(facebook,"PNG");
        System.out.println("facebook==>"+facebook.getScaleRatio());

        resizePhoto.resizePhoto3(instagram,"PNG");
        System.out.println("instagram==>"+instagram.getScaleRatio());
        resizePhoto.resizePhoto3(instagram,"GIF");
        System.out.println("instagram==>"+instagram.getScaleRatio());

        System.out.println("twitter==>"+twitter.getScaleRatio());
        resizePhoto.resizePhoto3(twitter,"JPG");
        System.out.println("twitter==>"+twitter.getScaleRatio());




    }
}
