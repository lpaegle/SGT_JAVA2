package lesson6;

abstract public class Shape {
    // abstract -
    abstract public int calculatePerimeter();

}

class Rectangle extends Shape{

    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
//  rewrite by ourselves
    @Override
    public int calculatePerimeter() {
        return (height + width) * 2;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
class Square extends Shape{

    private int side;


    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}