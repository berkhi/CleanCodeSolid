package com.berkhayta._01_Solid._02_OCP._02_OCP_Uygun;
// Sorun: Yeni bir rapor türü eklediğimizde kodda değişiklik yapmamız gerekiyor.
// Bu Solid prensiplerinde Open/Closed İlkesine Aykırıdır!
// OCP'ye uygun hale getirmek için Polimorfizm ve Abstraction'dan (Interface || Abstract Class) yararlanacağız.
public class RaporOlusturucu {
    public void raporOlustur(IRapor rapor){
     rapor.raporOlustur();

    }

    public static void main(String[] args) {
        RaporOlusturucu raporOlusturucu=new RaporOlusturucu();
        raporOlusturucu.raporOlustur(new Pdf());
        raporOlusturucu.raporOlustur(new Excel());
        raporOlusturucu.raporOlustur(new Muhasebe());
    }
}
