package com.berkhayta._01_Solid._01_SRP._01_SRP_Uygun;

public class MaasManager {
    // Maaş Bordrosunu hesaplama:
    public void maasHesapla(Calisan calisan) {
        double vergi = calisan.getBrutMaas() * 0.2;
        double netMaas = calisan.getBrutMaas() - vergi;
        System.out.println(calisan.getAd() + " adlı çalışanın Net maaşı:" + netMaas);
    }
}
