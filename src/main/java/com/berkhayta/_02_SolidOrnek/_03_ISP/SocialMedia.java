package com.berkhayta._02_SolidOrnek._03_ISP;

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
