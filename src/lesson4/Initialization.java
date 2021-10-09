package lesson4;

public class Initialization {
    public static void main(String[] args) {
//        BAD EXAMPLE !!!!
        String boopOrWoop;
        boopOrWoop = boop();

//        GOOD EXAMPLE
        String woopOrBoop = "";
        woopOrBoop = woop();

    }
    static String boop(){
        return "boop";
    }
    static String woop(){
        return "woop";
    }
}
