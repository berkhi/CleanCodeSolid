package com.berkhayta._01_Solid._01_SRP._01_SRP_Aykiri;

/*
Sorun: Burada hem çalışan bilgileri tutulmaya çalışılıyor. Hem de maaş hesaplama yapılıyor.
2 farklı iş bir sınıfta olmamalı. SRP'ye aykırı bir durum söz konusu.
 */

public class Calisan {
    private String ad;
    private int id;
    private String departman;
    private double brutMaas;

    public Calisan(String ad, int id, String departman, double brutMaas) {
        this.ad = ad;
        this.id = id;
        this.departman = departman;
        this.brutMaas = brutMaas;
    }

    //Çalışan bilgilerini getirecek metod:
    public void calisanBilgileriniGoster() {
        System.out.println(
                "ID: " + id + "ad:" + ad +   "departman:" + departman +  "brutMaas:" + brutMaas
        );
    }

    // Maaş Bordrosunu hesaplama:
    public void maasHesapla() {
        double vergi = brutMaas * 0.2;
        double netMaas = brutMaas - vergi;
        System.out.println(ad + " adlı çalışanın Net maaşı:" + netMaas);
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public double getBrutMaas() {
        return brutMaas;
    }

    public void setBrutMaas(double brutMaas) {
        this.brutMaas = brutMaas;
    }
}
