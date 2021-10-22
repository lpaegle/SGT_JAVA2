package lesson9;

public final class FinalClasses {

    private int someInt;

    /**
     *
     * @param anotherInt
     * @return
     */
    public int multiplyBySomeInt(int anotherInt){

        return anotherInt * someInt;
    }
}

//Final class can't be extended - NEVER DO THIS

/*
    class ExtendedFinalClasses extends FinalClasses{
    }
*/

