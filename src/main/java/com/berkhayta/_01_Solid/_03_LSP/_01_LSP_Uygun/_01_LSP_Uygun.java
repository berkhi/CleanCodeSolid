package com.berkhayta._01_Solid._03_LSP._01_LSP_Uygun;



public class _01_LSP_Uygun {
}

class Rectangle implements IShape{
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

class Square implements IShape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side*side;
    }
}
