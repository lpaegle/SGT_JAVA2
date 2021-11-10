package lesson19;

import lesson19.exceptions.DBPasswordAllCapsExcep;
import lesson19.exceptions.DBPasswordInccorectException;
import lesson19.exceptions.DbException;

public class Lesson19 {
    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();

        exceptions.divideByNumber(100, 50);

        try {
            exceptions.divideByNumber(99, 0);
        } catch (ArithmeticException e) {
            System.out.println("Pull yourself together, its wrong");
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled ");
        } finally {
            System.out.println("This block will be always called!");
        }

        try {
            System.out.println("Connect to DB");
            throw new DBPasswordAllCapsExcep();

        } catch (DbException e) {
            // handle this exception
            System.out.println("Exception has been handled.");

            if (e instanceof DBPasswordAllCapsExcep) {
                System.out.println("Exception is All Caps");
            } else if (e instanceof DBPasswordInccorectException) {
                System.out.println("Password is incorrect");
            }
        }

        try {
            throw new DbException("some custom message in some deeper level");
        } catch (DbException e) {
            System.out.println("There is excep: " + e.getMessage());    //often used method
        }


        try {
            exceptions.multiplyByTwo(5);
        } catch (Exception e) {
            e.printStackTrace();    // often used method
        }
        System.out.println("Print smth after executing stackTrace");

        //Assertion
        boolean userAuthenticated = true;
        assert userAuthenticated;
        System.out.println("user is authenticated");

        userAuthenticated = false;
        try {
            assert userAuthenticated;
        }catch (Exception e) {
            System.out.println("User not authenticated");
        }
    }
}
