package com.berkhayta._00_CleanCode.openClosed;


public class Daire implements ISekil{
    private double yaricap;


    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI*Math.pow(yaricap,2);
    }
}