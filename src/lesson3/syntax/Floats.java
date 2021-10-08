package lesson3.syntax;

public class Floats {

    final static float PI = 3.14f;
    public static void main(String[] args) {

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
