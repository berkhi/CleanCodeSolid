package com.berkhayta._01_Solid._03_LSP._00_LSP_Uygun;

public class _00_LSP_Uygun {
}
abstract class Logger{

    public abstract void logYaz();
}

abstract class DbLogger extends Logger{
    public abstract void baglantiAc();
    public abstract void baglantiKapat();
}

class DatabaseLogger extends DbLogger{

    @Override
    public void baglantiAc() {
        //Db bağlantı açma kodları
    }

    @Override
    public void baglantiKapat() {
        //Db bağlantı kapatma kodları
    }

    @Override
    public void logYaz() {
        baglantiAc();
        //log kayıtlarını yazacak kodlar
        baglantiKapat();

    }
}

class FileLogger extends Logger{
    @Override
    public void logYaz() {
        //log kayıtlarını yazacak kodlar
    }
}
