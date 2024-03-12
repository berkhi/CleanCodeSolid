package com.berkhayta._01_Solid._02_OCP._02_OCP_Uygun;

public class Excel implements IRapor{
    @Override
    public void raporOlustur() {
        System.out.println("Excel rapor oluşturuldu");
    }
}
