package com.berkhayta._00_CleanCode;

/*

Clean Code : Temiz Kod X Kirli Kod -> Kötü Kokar (Code Smell)
* Kolay okunabilir olmalı
* KISS (Keep It Simple Stupid) Basitlik
* İsimlendirmeler anlamlı olmalı.
* Kod Tekrardan kaçınılmalı. (Metodlar ile)
* Açıklayıcı yorum satıları olmalı
* Her metod bir işlem yapmalı. (SRP: Single Responsibility Principal)
* Hata kontrol yönetimi olmalı.
* Security'e uygun olmalı.
* Static kullanımı azaltılmalı.
* Test edilebilir kod yazılmalı.
* Uygun yapılar tercih edilmeli.
* Bağımlılıklar az olmalı ?
* Tight Couple X Loose Couple
* Girintilere, Hizalamalara, Boşluklara dikkat edilmeli.
* OOP Temel ilkelere uygun kod yazılmalı.
* Access modifierlar doğru kullanılmalı.

Clean Code: Bu kurallara uymak zorunda değilsiniz. Uymasanız da çalışan programlar yazabilirsiniz.
AMA UYMANIZ ŞİDDETLE ÖNERİLİR!!!

Java Değişken isimlendirme
package isimlendirme:   Hepsi küçük harf olmalı. : com.bilgeadam
Sınıf isimlendirme:     ClassName : her kelimenin ilk harfleri büyük, gerisi küçük olacak.
Metod isimlendirme:     metodName:  İlk kelimenin ilk harfi küçük diğer kelimelerin ilk harfleri büyük, diğerleri küçük.
Değişken isimlendirme:  metodGibi
static final değişken isimlendirme: DUNYANIN_CAPI Bütün harfler büyük aralarda _ var.

Bir sınıf kaç metoddan oluşmalı? 100 tane metod yazsak olur mu?
max 20 metod olmalı.

Bir metod kaç satırdan kaç oluşmalı?
max 20 satır olmalı.

Bir metod kaç parametre almalı?
Max 3. parametre almalı.

Copy>Paste Yerine Cut>Paste yapın.


 */


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _OO_CleanCode {


    public static void main(String[] args) {
        List<String> isimListesii = List.of("aa", "bb", "cc", "ff", "ee");
        List<String> siraliListe = listeSirala(isimListesii);

        siraliListe.forEach(System.out::println);
        isimListesii.forEach(System.out::println);

        for (int i = 2; i <= 10; i+=2) {

                System.out.println(i);

        }
    }

    public static int bee(int[] d) {
        int max = d[0];
        for (int i = 1; i < d.length; i++) {
            if (d[i] > max) {
                max = d[i];
            }
        }
        return max;
    }



    public static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;

    }
    public static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;

    }





    public static double bolmeHesapla(double bolen, double bolunen) {
        if (bolunen != 0) {
            return bolen / bolunen;
        } else {
            throw new IllegalArgumentException("Bölünen 0 olamaz.");
        }
    }


    public static int faktoriyelHesapla(int n) {
        //recursive!
        if (n == 0 || n == 1) {
            return 1; //
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be positive"); //
        } else {
            int faktoriyel = 1;
            for (int i = 2; i <= n; i++) {
                faktoriyel *= i; //
            }
            return faktoriyel;
        }
    }


    public static double toplamaHesapla(double a, double b, double c, double d) {
        return a + b + c + d;
    }
//    public static double toplamaHesapla(double... sayilar){
//        double toplam=0;
//        for (double sayi:sayilar){
//            toplam +=sayi;
//        }
//        return toplam;
//    }

    public static double toplamaHesapla(double... sayilar) {
        return Arrays.stream(sayilar).sum();
    }


    public static void dosyaOku(String dosyaAdi) {
        FileReader reader = null;
        try {
            reader = new FileReader(dosyaAdi);
            // Dosya okuma işlemleri

        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatma hatası: " + e.getMessage());
            }
        }
    }


    public static List<String> listeSirala(List<String> liste) {
        List<String> siraliListe = new ArrayList<String>(liste);
        Collections.sort(siraliListe);
        return siraliListe;
    }


//    /**
//     * Eşit uzunluktaki dizideki elemanların toplamını döner.
//     * @param dizi1
//     * @param dizi2
//     * @return
//     */
//    public static int[] diziTopla(int[] dizi1, int[] dizi2) {
//
//        int[] sonuc = new int[dizi1.length];
//        for (int i = 0; i < dizi1.length; i++) {
//            sonuc[i] = dizi1[i] + dizi2[i];
//        }
//        return sonuc;
//    }
//
//
//
//    public static boolean elemanAra(int[] dizi, int eleman) {
//
//        for (int i = 0; i < dizi.length; i++) {
//            if (dizi[i] == eleman) {
//               return true;
//            }
//        }
//        return false;
//    }


}

