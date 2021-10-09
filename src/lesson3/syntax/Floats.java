package lesson3.syntax;

public class Floats {

    final static float PI = 3.14f;  //  Constants outside main, so it can be accessed in all classes (main, circlePerimeter, circleArea)

    public static void main(String[] args) {
//      FLOAT - keeps 10 numbers after comma, good practise to put f at the end
//      DOUBLE - keeps 32 numbers after comma

        float radius = 5.5f;
        double diameter = 28.123d;

        float result = circlePerimeter(radius);
        System.out.println("Perimeter of circle is " + result);
        System.out.println("Area of circle is " + circleArea(radius));

    }

    static float circlePerimeter(float radius) {
        return 2 * PI * radius;
    }
    static float circleArea(float radius) {
        return PI * radius * radius;
    }

}
