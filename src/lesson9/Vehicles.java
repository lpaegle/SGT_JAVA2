package lesson9;

public abstract class Vehicles {

    /*
    Abstract methods in abstract class have to be implemented (overridden) in child class/es
    when extended from abstract parent class.

     */

    // abstract and 'normal' methods
    public abstract double calculateEfficiency();

    public double showSpeed(){
        return Math.random() * 100;
    }

}

class Truck extends Vehicles {

    @Override
    public double calculateEfficiency() {
        return 12;
    }
}

class App {
    public static void main(String[] args) {
        Truck myNewTruck = new Truck();

        System.out.println(myNewTruck.calculateEfficiency());
        System.out.println(myNewTruck.showSpeed());
    }
}