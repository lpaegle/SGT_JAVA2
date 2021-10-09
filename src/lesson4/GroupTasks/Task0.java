package lesson4.GroupTasks;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
//        FizzBuzz
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the max number. ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
