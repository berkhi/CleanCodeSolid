package com.berkhayta._00_CleanCode;

public class GeometriHesaplama {

    // ben yeni bi şekil hesaplanması için ne yapacağım?
    // Sınıflar gelişime Open- değişime Closed olmalı.

    public double alanHesapla(String sekil, double... parametreler) {
        if (sekil.equals("kare")) {
            double kenar = parametreler[0];
            return kenar * kenar;
        } else if (sekil.equals("dikdortgen")) {
            double kenar1 = parametreler[0];
            double kenar2 = parametreler[1];
            return kenar1 * kenar2;
        } else if (sekil.equals("daire")) {
            double yariCap = parametreler[0];
            return Math.PI * yariCap * yariCap;
        }
        return 0;
    }
}
