package lesson9;

public class FinalMethods {

    final int CONSTANT_NOINIT;//can be initialized here or...

    public FinalMethods() {
        //..can be initialized in constructor
        //Should be in ALL constructors
        CONSTANT_NOINIT = 5;

    }

    public final void printHello(){
        System.out.println(" Hello");
    }
}

class ExtendedFinalMethods extends FinalMethods{

    //Final methods can't be overridden

//    @Override
//    public void printHello(){
//        System.out.println(" Bye ");
//    }
}
