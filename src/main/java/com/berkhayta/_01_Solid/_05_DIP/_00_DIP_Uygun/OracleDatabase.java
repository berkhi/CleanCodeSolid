package com.berkhayta._01_Solid._05_DIP._00_DIP_Uygun;

//Düşük seviye sınıf:
public class OracleDatabase implements IDatabase {
    public void add(Object o){
        System.out.println("Obje veritabanına eklendi");
    }
}

class MySqlDatabase implements IDatabase {
    @Override
    public void add(Object o) {
        System.out.println("Obje veritabanına eklendi");
    }
}
// Cohesion
//Yüksek seviye sınıf:
class HataRaporlama{
    private IDatabase database;


    public HataRaporlama(IDatabase database) {
        this.database = database;
    }

    public void hataRapolar(Exception exception){
        database.add(exception);
    }
}



