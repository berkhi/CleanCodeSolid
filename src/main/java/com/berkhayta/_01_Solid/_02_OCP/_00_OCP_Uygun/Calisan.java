package com.berkhayta._01_Solid._02_OCP._00_OCP_Uygun;

public class Calisan {
}
class CalisanManager{
    public void calisanEkle(IDatabase database,Calisan calisan){
       database.add(calisan);
    }
}

class OracleDatabase implements IDatabase{

    @Override
    public void add(Calisan calisan) {
        //ekleme kodları
    }
}

class MySQLDatabase implements IDatabase{
    public void add(Calisan calisan){
        //ekleme kodları
    }
}

class MongoDatabase implements IDatabase{

    @Override
    public void add(Calisan calisan) {
        //ekleme kodları
    }
}

class PostgreDatabase implements IDatabase{

    @Override
    public void add(Calisan calisan) {
        //ekleme kodları
    }
}

