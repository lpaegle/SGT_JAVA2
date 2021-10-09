package lesson4;

public class ControlFlows {

    //    BRANCHING - if's and switches
    public static void main(String[] args) {
        int myAge = 31;
        if (myAge > 64){
            System.out.println("Retirement time");
        }else if (myAge < 7){
            System.out.println("Kinderagarden time");
        }else {
            System.out.println("Time to work!");
        }

        switch (myAge){
            case 5:
                System.out.println("5 years old");
                break;
            case 31:
                System.out.println("31 years old");
                break;
            case 55:
                System.out.println("55 years old");
                break;
            default:
                System.out.println("Some other age");
        }

//        CIRCULAR FLOW
        for (int i = 0; i < 10; i++){
            System.out.println("Are you done yet?");
        }
        System.out.println("Finally!");

//         foreach loop
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Kate";
        students[2] = "Marina";
        students[3] = "Tatjana";

        for (String studentName : students) {
            System.out.println(studentName);
        }

//        while loop
        int i = 0;
        while (i < 20){
            System.out.println("Loop is still running " + i);
            i++;
        }

//        do while loop - runs at least one time ! Even with wrong value
        do {
            System.out.println("This is do while loop");
        }while (i < 0);

//        Infinite loop with break
//        Stop loop when breakCondition > 10
        int breakCondition = 0;
        do {
            if (breakCondition > 10){
                break;
            }
            breakCondition++;
            System.out.println("Condition: " + breakCondition);
        }while (true);
        System.out.println("We are out of infinite loop.");

//        Loop where we skip elem 3 to 7
        for (int j = 0; j < 10; j++) {
            if (j > 3 && j < 7){
                continue;
            }
            System.out.println("Element that is not between 3 - 7: " + j);
        }


    }


}
