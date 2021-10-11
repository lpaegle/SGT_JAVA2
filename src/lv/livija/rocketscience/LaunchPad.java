package lv.livija.rocketscience;

import java.util.Scanner;

public class LaunchPad {
    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println("There are so many rockets: " + Rocket.countRockets());

        System.out.println("Name of the rocket - " + rocket1.getName());
        System.out.println("Weight of the rocket - " + rocket1.getWeight());

        Rocket rocket2 = rocket1;   // Don't do this
        rocket1.setName("Moon Dust");
        System.out.println("Name of the rocket - " + rocket1.getName());
        System.out.println("Name of the rocket - " + rocket2.getName());


        System.out.println(rocket1.id);     // can access only public attributes

        renameRocket(rocket1, "Sun Ghost");
        System.out.println("New name of the rocket - " + rocket1.getName());


        changeTheWeight(rocket1.getWeight(), 1000);     // object reference
        System.out.println("The weight of the rocket stayed the same outside the method: " + rocket1.getWeight());  //primitive data type

        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine());
        rocket3.printRocketData();


        //
        rocket3 = null; //all references = 0

        Scanner scanner = new Scanner(System.in);
        System.gc();    //garbage collector - cleans memory of "deleted" object
        System.out.println("Waiting fo r rocket to be destroyed");
        scanner.nextInt(); //scanner doesnt stop until GC has been done

        //Abstraction example
        Math.pow(2,2);
    }

    /**
     * Renames the Rocket
     * Changes the original object by reference
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName){
        rocket.setName(newName);
    }

    /**
     * Changes the weight only locally
     * Don't do this way!!!
     * @param weight
     * @param newWeight
     */
    private static void changeTheWeight(int weight, int newWeight){
        weight = newWeight;
        System.out.println("Weight was changed locally to " + weight);
    }
//    Instead, do this ->
//    rocket1.setWeight(1000);

}
