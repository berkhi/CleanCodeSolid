package com.berkhayta._01_Solid._02_OCP._02_OCP_Uygun;

public class Pdf implements IRapor{
    @Override
    public void raporOlustur() {
        System.out.println("Pdf rapor oluşturuldu");
    }
}
