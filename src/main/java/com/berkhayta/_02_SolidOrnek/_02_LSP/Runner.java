package com.berkhayta._02_SolidOrnek._02_LSP;

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

/*
Soru 4:
Whatsapp: videoConferance, Chat, sharePhoto, shareStory
Facebook: sharePost, Chat, sharePhoto, shareStory
Instagram: sharePost, Chat, sharePhoto, shareStory
Twitter: sharePost, Chat, sharePhoto, shareStory
 */
public class Runner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        Facebook facebook=new Facebook();
        Whatsapp whatsapp=new Whatsapp();
        Twitter twitter=new Twitter();
        ResizePhoto resizePhoto=new ResizePhoto();






    }
}
