package lesson3.syntax;

public class Conditionals {
    public static void main(String[] args) {
        String myName = "Livija";
        if (myName == "Livija"){
            System.out.println("That's me. ");
        }else {
            System.out.println("Not me.");
        }

//        Same but short hand notation
        String isThatMyName = myName == "Livia" ? "That's me." : "Not me.";
        System.out.println(isThatMyName);

        System.out.println(oddOrEven1(7));
        System.out.println(oddOrEven2(7));
    }


    /*
    App that decides whther a number is odd or even
     */
    static public String oddOrEven1(int number){
        if (number % 2 == 0){
            return "even";
        }else {
            return "odd";
        }
    }
    static public String oddOrEven2(int number){
        return number % 2 == 0 ? "even" : "odd";
    }
}
