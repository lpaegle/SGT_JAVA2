package lesson4;

public class References {

    public static void main(String[] args) {

        // This points to null
        String someString;

        // These two lines are identical
        someString = "Something nice";
        someString = new String("Something nice");


        Point point1 = new Point(7,11);
        System.out.println(point1.getX() + ", "+ point1.getY());

        Point point2 = point1;
        System.out.println(point2.getX() + ", "+ point2.getY());

        point2.setX(100);   // references both values
        System.out.println(point2.getX() + ", "+ point2.getY());
        System.out.println(point1.getX() + ", "+ point1.getY());

    }

}
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
