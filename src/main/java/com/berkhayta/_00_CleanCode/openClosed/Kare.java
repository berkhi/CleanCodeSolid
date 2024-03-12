package com.berkhayta._00_CleanCode.openClosed;

public class Kare implements ISekil{
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }
}
