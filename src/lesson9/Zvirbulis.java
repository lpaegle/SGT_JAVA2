package lesson9;

public class Zvirbulis implements FlyableInterface{

    @Override
    public void fly(int height) {
        System.out.println("Flying so high " + height);
    }
}
