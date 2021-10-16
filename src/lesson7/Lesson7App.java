package lesson7;

import lv.livija.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {

    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);

        //add people already in constructor
//        ArrayList<String> people = new ArrayList<>();
//        people.add("musk");
//        people.add("bezos");
//        people.add("brenson");


        PeopleSpaceShip peopleShip = new PeopleSpaceShip(new Engine(), "Elon", 100, 3,
                new ArrayList<String>());

        //changing values (adding)
        peopleShip.getNamesOfPeople().add("Bezos");
        peopleShip.getNamesOfPeople().add("Musk");
        peopleShip.getNamesOfPeople().add("Brenson");

        //add some cargo
        peopleShip.addCargo();
        peopleShip.addCargo(50);    //should return int


        System.out.println(peopleShip);

        printInfoAboutSpaceShip(peopleShip);

        //Virtual Method
        //prints one line - original
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();

        //prints 2 lines - original and overridden
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();

        //upcasting
        SpaceShip castedSpaceShip =  (SpaceShip) peopleShip;

        //downcasting - should be checked before with 'instanceof'
        //not possible to use!!!
//        PeopleSpaceShip castedPeopleShip = (PeopleSpaceShip) spaceShip;
//        castedPeopleShip.getNamesOfPeople();//will not fail on compiler but will on runtime


    }

    public static void printInfoAboutSpaceShip(SpaceShip spaceShip){
        System.out.println("SpaceShip: " + spaceShip);
    }
}
