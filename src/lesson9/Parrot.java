package lesson9;

public class Parrot implements WalkableInterface, FlyableInterface{

    @Override
    public void fly(int height) {
        System.out.println(height);
    }

    @Override
    public void walk(int speed) {
        System.out.println(speed);
    }
}
