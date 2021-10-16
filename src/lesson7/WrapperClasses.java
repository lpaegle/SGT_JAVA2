package lesson7;

public class WrapperClasses {

    public static void main(String[] args) {

        //primitive data types wrapped into objects and add methods
        int simpleInt = 5;
        Integer.toString(simpleInt);

    }
    private int minimum(int a, int b){
        return Integer.min(a,b);    // wrapper method
    }
}
