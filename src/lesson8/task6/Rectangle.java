package lesson8.task6;

public class Rectangle extends Shape{


    public Rectangle() {
    }

    public void message(){
        System.out.println("This is rectangular shape.");
    }

}


class Square extends Rectangle{
    public void message(){
        System.out.println("Square is a rectangle.");
    }

}
