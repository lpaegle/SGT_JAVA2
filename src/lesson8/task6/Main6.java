package lesson8.task6;

public class Main6 {
    public static void main(String[] args) {

        /*
        Create a class named 'Shape' with a method to print "This is shape". Then create two other classes named
        'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape"
        and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to
        print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
     */

        Square mySquare = new Square();
        mySquare.message();

        Shape otherShape = new Square();
        otherShape.message();

        Rectangle anotherShape = new Square();
        anotherShape.message();
    }
}
