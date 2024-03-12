package com.berkhayta._01_Solid._03_LSP._01_LSP_Aykiri;

public class _01_LSP_Aykiri {
}

class Rectangle{
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea(){
        return width * height;
    }
}


class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(width);
        super.setHeight(width);
    }

}
