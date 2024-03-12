package com.berkhayta._01_Solid._02_OCP._02_OCP_Aykiri;
// Sorun: Yeni bir rapor türü eklediğimizde kodda değişiklik yapmamız gerekiyor.
// Bu Solid prensiplerinde Open/Closed İlkesine Aykırıdır!
// OCP'ye uygun hale getirmek için Polimorfizm ve Abstraction'dan (Interface || Abstract Class) yararlanacağız.
public class RaporOlusturucu {
    public void raporOlustur(String raporTip){
        switch ( raporTip){
            case "PDF":
                System.out.println("PDF rapor oluşturuldu");
                break;
            case "Word":
                System.out.println("Word rapor oluşturuldu");
                break;
            case "Excel":
                System.out.println("Excel rapor oluşturuldu");
                break;
            default:
                System.out.println("RaporTip uygun formatta değil.");
        }

    }

    public static void main(String[] args) {
        RaporOlusturucu raporOlusturucu=new RaporOlusturucu();
        raporOlusturucu.raporOlustur("PDF");
    }
}
