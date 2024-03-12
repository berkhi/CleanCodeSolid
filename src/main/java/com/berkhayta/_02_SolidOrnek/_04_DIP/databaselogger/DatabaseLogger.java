package com.berkhayta._02_SolidOrnek._04_DIP.databaselogger;

public class DatabaseLogger {
    MongoDb mongoDb=new MongoDb();
    PostgreSql postgreSql=new PostgreSql();

    public void logToMongoDB(String ex){
        mongoDb.log(ex);
    }
    public void logToPostgreSQL(String ex){
        postgreSql.log(ex);
    }
}
