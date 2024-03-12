package com.berkhayta._02_SolidOrnek._02_LSP;

import com.berkhayta._02_SolidOrnek.Utility.NotificationService;
import com.berkhayta._02_SolidOrnek.Utility.User;

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
