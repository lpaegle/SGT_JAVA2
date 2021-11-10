package lesson19;

public class Exceptions {

    public double multiplyByTwo(double someNumber){

        this.divideByNumber(7 , 0);
        return someNumber * 2;
    }

    public double divideByNumber(int dividable, int divider) throws ArithmeticException{

        try {
            return dividable / divider;
        }catch (ArithmeticException e){
            System.out.println("There is an arithmetic exception: " + e);
            throw e;
        }
    }



}
