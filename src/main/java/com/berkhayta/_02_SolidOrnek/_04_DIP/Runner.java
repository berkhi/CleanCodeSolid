package com.berkhayta._02_SolidOrnek._04_DIP;

import com.berkhayta._02_SolidOrnek.Utility.ResizePhoto;
import com.berkhayta._02_SolidOrnek._04_DIP.databaselogger.DatabaseLogger;
import com.berkhayta._02_SolidOrnek._04_DIP.exception.StoryException;
import com.berkhayta._02_SolidOrnek._04_DIP.exception.VideoException;
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

/*
Soru 4:
Whatsapp: videoConferance, Chat, sharePhoto, shareStory
Facebook: sharePost, Chat, sharePhoto, shareStory
Instagram: sharePost, Chat, sharePhoto, shareStory
Twitter: sharePost, Chat, sharePhoto, shareStory
 */

/*
Twitter diyor ki, ben artık shareStory(); desteklemiyorum.
 */

/*

 */
public class Runner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        Facebook facebook = new Facebook();
        Whatsapp whatsapp = new Whatsapp();
        Twitter twitter = new Twitter();
        ResizePhoto resizePhoto = new ResizePhoto();
        DatabaseLogger dbLogger = new DatabaseLogger();


        try {
            whatsapp.videoConferance();
        } catch (VideoException e) {
            //DatabaseLogger sınıfı üzerinden MongoDB'ye log almak istiyoruz.
            dbLogger.logToMongoDB(e.getMessage());
        }

        try {
            whatsapp.shareStory();
        } catch (StoryException e) {
            //DatabaseLogger sınıfı üzerinden PostgreSQL'ye log almak istiyoruz.
            dbLogger.logToPostgreSQL(e.getMessage());
        }

    }
}
