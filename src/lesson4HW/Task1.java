package lesson4HW;

public class Task1 {
    public static void main(String[] args) {

        String s = "00146 wwd";

        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s){
        //check if string is not empty
        if (s == "" || s.length() < 1){
            return 0;
        }else {

            s = s.trim();   //removes leading whitespaces

            char sign = '+'; //let's assume number is always positive
            int i = 0;

            //check if negative or positive
            if (s.charAt(0) == '-') {
                sign = '-';
                i++;
            } else if (s.charAt(0) == '+') {
                i++;
            }
            int result = 0;

            //remove all non-digits after digits
            while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result = Integer.parseInt(s.replaceAll("\\D.*", ""));
                i++;
            }

            if (sign == '-') {
                result = -result;
            }

            //to int stay in range
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            return result;

        }

    }
}
