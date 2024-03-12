package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public class InstagramPost extends Post implements IPostFoto, IPostVideo {
    private String aciklama;
    private String fotoUrl;

    public InstagramPost(String title, String content,String aciklama) {
        super(title, content);
        this.aciklama=aciklama;
    }

    public String getAciklama() {
        return aciklama;
    }


    @Override
    public String display() {
        return "InstagramPost \n Title:"+title+ "\nContent:"+content+ "\nAciklama"+aciklama+"\n Foto url:"+fotoUrl;
    }

    @Override
    public void postFoto(String FotoUrl) {
        this.fotoUrl=fotoUrl;
    }

    @Override
    public void postVideo(String videoUrl) {

    }
}
