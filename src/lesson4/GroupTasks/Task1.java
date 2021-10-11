package lesson4.GroupTasks;


import javax.swing.*;

public class Task1 {
    public static void main(String[] args) {

        int[] numOfArray = {
                2,
                4,
                8
        };

        int first = numOfArray[0];      // first array element assigned as first
        for (int i = 1; i < numOfArray.length; i++) {
            if (numOfArray[i] > first) {
                first = numOfArray[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < numOfArray.length; i++) {
            if (numOfArray[i] > second && numOfArray[i] < first) {
                second = numOfArray[i];
            }
        }
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < numOfArray.length; i++) {
            if (numOfArray[i] > third && numOfArray[i] < second) {
                third = numOfArray[i];
            }

        }

        if (third == Integer.MIN_VALUE){
            System.out.println("Third doesn't exist, returned value is : " + second);
        }else {
            System.out.println("Third distinct maximum is " + third);
        }


    }
}
