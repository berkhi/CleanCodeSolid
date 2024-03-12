package com.berkhayta._01_Solid._05_DIP._00_DIP_Aykiri;

//Düşük seviye sınıf:
public class OracleDatabase {
    public void add(Object o){
        System.out.println("Obje veritabanına eklendi");
    }
}


class MySqlDatabase {
    public void add(Object o){
        System.out.println("Obje veritabanına eklendi");
    }
}

//Yüksek seviye sınıf:
class HataRaporlama{
    private OracleDatabase database;

    public HataRaporlama() {
        this.database = new OracleDatabase();
    }


//    public HataRaporlama(OracleDatabase database) {
//        this.database = database;
//    }

    public void hataRapolar(Exception exception){
        database.add(exception);
    }
}



