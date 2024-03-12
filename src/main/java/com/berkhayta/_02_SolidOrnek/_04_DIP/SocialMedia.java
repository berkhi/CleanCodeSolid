package com.berkhayta._02_SolidOrnek._04_DIP;

public abstract class SocialMedia {
    private double scaleRatio;

    public double getScaleRatio() {
        return scaleRatio;
    }

    public void setScaleRatio(double scaleRatio) {
        this.scaleRatio = scaleRatio;
    }


//abstract metod ekledik!
    public abstract void resize(String type);
}
