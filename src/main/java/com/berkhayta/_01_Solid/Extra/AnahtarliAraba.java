package com.berkhayta._01_Solid.Extra;

public class AnahtarliAraba implements IArac {
    @Override
    public void motoruCalistir() {
        System.out.println("AnahtarliAraba motoru çalıştı");
    }

    @Override
    public void motoruDurdur() {
        System.out.println("AnahtarliAraba motoru durdu");
    }

    @Override
    public void hizlan() {
        System.out.println("AnahtarliAraba hızlandı");
    }

    @Override
    public void dur() {
        System.out.println("AnahtarliAraba durdu");
    }

    @Override
    public void don() {
        System.out.println("AnahtarliAraba döndü");
    }
}
