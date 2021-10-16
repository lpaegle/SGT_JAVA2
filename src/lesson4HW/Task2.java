package lesson4HW;

import lesson3.syntax.Casts;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();

        System.out.println("Roman: " + romans(num));// result won't show, didn't fix result part

    }

    public static String romans(int num) {
        //number between 1 and 3999
        if (num <= 1 && num >= 3999) {
            System.out.println("Invalid number input");
        }
        String result = Integer.toString(num);

        String thousands = "";
        String hundreds = "";
        String tens = "";
        String ones = "";


        for (int i = 0; i < result.length(); i++) {
            if (result.length() == 4) {
                switch (result.charAt(0)) {
                    case 1:
                        thousands = "M";
                        break;
                    case 2:
                        thousands = "MM";
                        break;
                    case 3:
                        thousands = "MMM";
                        break;
                    default:
                        thousands = "";
                }
                switch (result.charAt(1)) {
                    case 1:
                        hundreds = "C";
                        break;
                    case 2:
                        hundreds = "CC";
                        break;
                    case 3:
                        hundreds = "CCC";
                        break;
                    case 4:
                        hundreds = "CD";
                        break;
                    case 5:
                        hundreds = "D";
                        break;
                    case 6:
                        hundreds = "DC";
                        break;
                    case 7:
                        hundreds = "DCC";
                        break;
                    case 8:
                        hundreds = "DCCC";
                        break;
                    case 9:
                        hundreds = "CM";
                    default:
                        hundreds = "";
                }
                switch (result.charAt(2)) {
                    case 1:
                        tens = "X";
                        break;
                    case 2:
                        tens = "XX";
                        break;
                    case 3:
                        tens = "XXX";
                        break;
                    case 4:
                        tens = "XL";
                        break;
                    case 5:
                        tens = "L";
                        break;
                    case 6:
                        tens = "LX";
                        break;
                    case 7:
                        tens = "LXX";
                        break;
                    case 8:
                        tens = "LXXX";
                        break;
                    case 9:
                        tens = "XC";
                        break;
                    default:
                        tens = "";
                }
                switch (result.charAt(3)) {
                    case 1:
                        ones = "I";
                        break;
                    case 2:
                        ones = "II";
                        break;
                    case 3:
                        ones = "III";
                        break;
                    case 4:
                        ones = "IV";
                        break;
                    case 5:
                        ones = "V";
                        break;
                    case 6:
                        ones = "VI";
                        break;
                    case 7:
                        ones = "VII";
                        break;
                    case 8:
                        ones = "VIII";
                        break;
                    case 9:
                        ones = "IX";
                        break;
                    default:
                        ones = "";
                }

            }
            else if (result.length() == 3){
                switch (result.charAt(0)) {
                    case 1:
                        hundreds = "C";
                        break;
                    case 2:
                        hundreds = "CC";
                        break;
                    case 3:
                        hundreds = "CCC";
                        break;
                    case 4:
                        hundreds = "CD";
                        break;
                    case 5:
                        hundreds = "D";
                        break;
                    case 6:
                        hundreds = "DC";
                        break;
                    case 7:
                        hundreds = "DCC";
                        break;
                    case 8:
                        hundreds = "DCCC";
                        break;
                    case 9:
                        hundreds = "CM";
                    default:
                        hundreds = "";
                }
                switch (result.charAt(1)) {
                    case 1:
                        tens = "X";
                        break;
                    case 2:
                        tens = "XX";
                        break;
                    case 3:
                        tens = "XXX";
                        break;
                    case 4:
                        tens = "XL";
                        break;
                    case 5:
                        tens = "L";
                        break;
                    case 6:
                        tens = "LX";
                        break;
                    case 7:
                        tens = "LXX";
                        break;
                    case 8:
                        tens = "LXXX";
                        break;
                    case 9:
                        tens = "XC";
                        break;
                    default:
                        tens = "";
                }
                switch (result.charAt(2)) {
                    case 1:
                        ones = "I";
                        break;
                    case 2:
                        ones = "II";
                        break;
                    case 3:
                        ones = "III";
                        break;
                    case 4:
                        ones = "IV";
                        break;
                    case 5:
                        ones = "V";
                        break;
                    case 6:
                        ones = "VI";
                        break;
                    case 7:
                        ones = "VII";
                        break;
                    case 8:
                        ones = "VIII";
                        break;
                    case 9:
                        ones = "IX";
                        break;
                    default:
                        ones = "";
                }

            }
            else if (result.length() == 2){
                switch (result.charAt(0)) {
                    case 1:
                        tens = "X";
                        break;
                    case 2:
                        tens = "XX";
                        break;
                    case 3:
                        tens = "XXX";
                        break;
                    case 4:
                        tens = "XL";
                        break;
                    case 5:
                        tens = "L";
                        break;
                    case 6:
                        tens = "LX";
                        break;
                    case 7:
                        tens = "LXX";
                        break;
                    case 8:
                        tens = "LXXX";
                        break;
                    case 9:
                        tens = "XC";
                        break;
                    default:
                        tens = "";
                }
                switch (result.charAt(1)) {
                    case 1:
                        ones = "I";
                        break;
                    case 2:
                        ones = "II";
                        break;
                    case 3:
                        ones = "III";
                        break;
                    case 4:
                        ones = "IV";
                        break;
                    case 5:
                        ones = "V";
                        break;
                    case 6:
                        ones = "VI";
                        break;
                    case 7:
                        ones = "VII";
                        break;
                    case 8:
                        ones = "VIII";
                        break;
                    case 9:
                        ones = "IX";
                        break;
                    default:
                        ones = "";
                }

            }
            else if (result.length() == 1){
                switch (result.charAt(0)) {
                    case 1:
                        ones = "I";
                        break;
                    case 2:
                        ones = "II";
                        break;
                    case 3:
                        ones = "III";
                        break;
                    case 4:
                        ones = "IV";
                        break;
                    case 5:
                        ones = "V";
                        break;
                    case 6:
                        ones = "VI";
                        break;
                    case 7:
                        ones = "VII";
                        break;
                    case 8:
                        ones = "VIII";
                        break;
                    case 9:
                        ones = "IX";
                        break;
                    default:
                        ones = "";
                }

            }

        }
        //didn't fix this result return part
        result = thousands + hundreds + tens + ones;

        return result;
    }
}
