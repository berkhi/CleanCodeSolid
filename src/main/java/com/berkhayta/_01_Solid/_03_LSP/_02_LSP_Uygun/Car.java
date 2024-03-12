package com.berkhayta._01_Solid._03_LSP._02_LSP_Uygun;


public class Car implements IMotorluArac {

    @Override
    public void calistir() {
        System.out.println("Car çalıştı");
    }

    @Override
    public void hizlan() {
        System.out.println("Car hızlandı");
    }
}
