package chap6;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(){
        length=0;
        width=0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }


    public double calculatePerimeter(){
        return (2* length) + (2*width);
    }
    public double calculateArea(){
        return length *width;
    }

}
