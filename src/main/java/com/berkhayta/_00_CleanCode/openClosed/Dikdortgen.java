package com.berkhayta._00_CleanCode.openClosed;

public class Dikdortgen implements ISekil{
    private double kenar1;
    private double kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    public double alanHesapla() {
        return kenar1*kenar2;
    }
}