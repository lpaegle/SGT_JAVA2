package lesson4;

public class Arrays {
    public static void main(String[] args) {
        //    Define an array
        int[] arrayOfInteger;
        //    Initialize an array
        arrayOfInteger = new int[5];

        //    Same in one line
        int[] anotherArray = new int[10];

//        print alphabet
        System.out.println(initAlphabet());


//        easy array initialization
        String[] cities = {
                "Riga",
                "London",
                "Paris"
        };
//        this ^ is equal to
        String[] cities2 = new String[3];
        cities2[0] = "Tokyo";
        cities2[1] = "Los Angelos";
        cities2[2] = "Singapore";


//        String[] newCities = new String[3];
//        System.arraycopy(cities, 0, newCities, 0, cities.length); //  combine two arrays in one
//        for (String city: newCities) {
//            System.out.print(city + ", ");
//        }


//        TWO DIMENSIONAL ARRAYS
        int[][] points = new int[10][10];
        points[0][0] = 99;
        points[0][1] = 5;
        System.out.println(points);

        for (int i = 0; i < points.length; i++) {
            System.out.println();
            for (int j = 0; j < points.length; j++) {
                System.out.print(points[i][j] + " ");
            }
        }


    }

    static char[] initAlphabet(){
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)('A' + i);  // (char) - casting int to char
        }
        return alphabet;
    }

}
