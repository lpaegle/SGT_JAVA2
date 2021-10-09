package lesson4;

public class Scopes {

    //    accessible to all methods -
    static final int SOME_CONSTANT = 314;

    public static void main(String[] args) {

        int someNumber = 99;
//        int someNumber = SOME_CONSTANT;

//        to pass the value as an argument to a method -
        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);
    }

    static int scopeVisible(int someNumber) {
        boolean visibleInsideMethod = true;

        return someNumber * 2;
    }

    //    DO LIKE THIS
    static int multiplyByFive(int number) {
        int five = 5;
//        int five = SOME_CONSTANT;

        return number * five;
    }

//    AVOID GLOBAL SCOPES - if no specific reason

}
