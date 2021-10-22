package lesson9;

public class Penguin implements WalkableInterface{

    @Override
    public void walk(int speed) {
        System.out.println("Walking with speed " + speed);
    }
}
