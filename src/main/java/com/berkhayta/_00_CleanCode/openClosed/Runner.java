package com.berkhayta._00_CleanCode.openClosed;

public class Runner {
    public static void main(String[] args) {
        GeometriHesaplama geometriHesaplama=new GeometriHesaplama();
        Kare kare1=new Kare(5);
        System.out.println(geometriHesaplama.alanHesapla(kare1));
    }



}
