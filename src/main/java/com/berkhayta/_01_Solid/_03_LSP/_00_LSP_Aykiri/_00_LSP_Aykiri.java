package com.berkhayta._01_Solid._03_LSP._00_LSP_Aykiri;

public class _00_LSP_Aykiri {
}

abstract class Logger{
    public abstract void baglantiAc();
    public abstract void baglantiKapat();
    public abstract void logYaz();
}

class DatabaseLogger extends Logger{

    @Override
    public void baglantiAc() {

    }

    @Override
    public void baglantiKapat() {

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
    public void baglantiAc() {
        // buraya yazacak kodumuz yok.
    }

    @Override
    public void baglantiKapat() {
        // buraya yazacak kodumuz yok.
    }

    @Override
    public void logYaz() {
        baglantiAc();
        //log kayıtlarını yazacak kodlar
        baglantiKapat();
    }
}
