package com.berkhayta._02_SolidOrnek._01_OCP;

import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

/*
 Instagram sınıfı içinde scaleRatio özelliğimiz/field olsun.
 ResizePhoto diye bir sınıfımız olsun. Bu sınıf içinde boyutlandırma yapacağız.
 Boyutlandırma yapacak metod bizden instagram nesnesi ve string type isteyecek.
 eğer bu type JPG-> scaleRatio = 18
 eğer bu type PNG-> scaleRatio = 20
 eğer bu type default-> scaleRatio = 30
 olmalı.
 */
public class Instagram extends SocialMedia {


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
}
