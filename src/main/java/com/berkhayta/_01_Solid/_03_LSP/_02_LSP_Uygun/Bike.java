package com.berkhayta._01_Solid._03_LSP._02_LSP_Uygun;


public class Bike implements IArac {
    @Override
    public void hizlan() {
        System.out.println("Bisiklet hızlanıyor...");
    }
}