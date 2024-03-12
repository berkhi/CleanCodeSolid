package com.berkhayta._01_Solid._01_SRP._02_SRP_Aykiri;
// Sorun:  // manageProduct metodu birden çok iş yapıyor!
// SRP'ye göre bir metod yalnızca bir iş yapmalı.
public class ProductManager {

    public void manageProduct(String islemTuru,String productName){
        if(islemTuru.equals("ekle")){
            //ürün ekleme işlemleri
            System.out.println("Ürün eklendi.");
        }
        else if(islemTuru.equals("goruntule")){
            //ürün görüntüleme.
            System.out.println("ürün görüntülendi.");
        }else if(islemTuru.equals("sil")){
            // ürün silme kodları
            System.out.println("Ürün silindi.");
        }
    }

    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        productManager.manageProduct("ekle","Telefon");
        productManager.manageProduct("goruntule","Telefon");
        productManager.manageProduct("sil","Telefon");
    }
}
