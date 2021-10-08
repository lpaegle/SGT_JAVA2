package lesson3.syntax;

import lesson1.helloWorldLibrary.WorldLibrary;
import org.w3c.dom.ls.LSOutput;

public class Lesson3 {

    final String SOME_CONSTANT = "constant";    //final - cannot override it
    final float Pi = 3.14f;

    public static void main(String[] args) {

        RocketShip ship = new RocketShip();
        ship.fly(10);
        Bird bird = new Bird();
        bird.fly(1);
        Penguin penguin = new Penguin();
        penguin.fly(10);

        if (penguin instanceof Penguin) {
            System.out.println("Penguin is a penguin");
        }
        if (penguin instanceof Bird) {
            System.out.println("Penguin is a bird");
        }
//        if (penguin instanceof RocketShip) {
//            System.out.println("Penguin cannot be a rocketship");
//        }     //Not possible!

//        Print my name here from Statics
        Statics statics = new Statics("Livija");
        System.out.println("Name: " + statics.getName());

        System.out.println("Surname: " + Statics.getSurname());

    }

    public static String boop(){
        return WorldLibrary.getName();
    }
}

enum RocketTypes {  //Constant
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFlyInterface {  //will talk about this later
    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("I am flying!");
        return false;
    }
}

class Bird implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp, Chirp");
        return false;
    }
}

class Penguin extends Bird {
    public boolean walk(int speed){
        System.out.println(":)");
        return true;
    }
}