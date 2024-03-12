package com.berkhayta._01_Solid._02_OCP._02_OCP_Uygun;

public class Muhasebe implements IRapor{
    @Override
    public void raporOlustur() {
        System.out.println("Muhasebe rapor oluşturuldu");
    }
}
