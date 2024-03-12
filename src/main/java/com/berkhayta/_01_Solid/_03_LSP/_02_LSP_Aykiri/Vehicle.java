package com.berkhayta._01_Solid._03_LSP._02_LSP_Aykiri;

public class Vehicle {
    public void calistir(){
        System.out.println("Araç çalıştı");
    }
    public void hizlan(){
        System.out.println("Araç hızlandı");
    }
}

class Car extends Vehicle {
    @Override
    public void calistir() {
        System.out.println("Car çalıştı");
    }

    @Override
    public void hizlan() {
        System.out.println("Car hızlandı");
    }
}

class Bike extends Vehicle {
    @Override
    public void calistir() {
       //Neyi çalıştırayım?
        throw new UnsupportedOperationException("Bu işlem desteklenmiyor...");
    }

    @Override
    public void hizlan() {
        System.out.println("Bisiklet hızlandı");
    }
}
