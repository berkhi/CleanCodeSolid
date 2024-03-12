package com.berkhayta._01_Solid._02_OCP._00_OCP_Aykiri;

// Sorun: Yeni bir database'i devreye almak istediğimizde metodumuzda değişiklikler yapmak zorunda kalıyoruz.

public class Calisan {
}
class CalisanManager{
    public void calisanEkle(Object database,Calisan calisan){
        //vt ekleme komutları.
        if(database instanceof OracleDatabase) {
            ((OracleDatabase)database).ekle(calisan);
        }
        else if(database instanceof MongoDatabase) {
            ((MongoDatabase)database).insert(calisan);
        }
        else{
            ((MySQLDatabase)database).add(calisan);
        }
    }
}

class OracleDatabase{
    public void ekle(Calisan calisan){
        //...
    }
}

class MySQLDatabase{
    public void add(Calisan calisan){
        //...
    }
}

class MongoDatabase{
    public void insert(Calisan calisan){
        //...
    }
}

