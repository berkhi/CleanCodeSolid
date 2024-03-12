package com.berkhayta._01_Solid._01_SRP._02_SRP_Uygun;

public class ProductManager {

    public void addProduct(String productName){
        //ürün ekleme işlemleri
        System.out.println("Ürün eklendi.");
    }

    public void viewProduct(String productName){
        //ürün görüntüleme.
        System.out.println("ürün görüntülendi.");
    }

    public void deleteProduct(String productName){
        // ürün silme kodları
        System.out.println("Ürün silindi.");
    }

    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        productManager.addProduct("Telefon");
        productManager.viewProduct("Telefon");
        productManager.deleteProduct("Telefon");

    }
}
