
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author muham
 */
/*
Name:MUHAMMAD ALFATIH OLANIYAN
CLASS: CPSC101
ID:230148724
ASSIGNMENT 1
 */
public class NumToString3 {

    private static final String[] ONES = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] BIGS = {" ", "thousand", "million", "hundred"};

    public static String numbToString(int n) { //MAIN METHOD WHICH CALLS METHODS BELOW
        int counter = 0;
        String result = "";
        int x = 0;
        while (n > 0) {
            int temp = n % 1000;
            if (counter == 0 && temp != 0) {
                x = 0;
            }
            if (counter == 1 && temp != 0) {
                x = 1;
            } else {
                x = 0;
            }
            if (counter == 2 && temp != 0) {
                x = 2;

            }

            String words = numbToStringhund(temp);
            result = words + BIGS[x] + result;
            ++counter;
            n = n / 1000;
        }
        return result;
    }

    public static String numbToStringhund(int n) {
        String words = "";
        for (int counter = 0; counter < 3; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {//if it is a single digit
                        words = ONES[(n % 10) - 1];
                        if ((n / 10) == 0) {
                            n = n / 10;
                        }
                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && (n != 0) && ((n % 100) / 10) != 0) { //if it is in between 11 and 19
                        words = TEENS[(n % 10)];
                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = TENS[((n % 100) / 10) - 2] + "-" + words;

                        n = n / 100;
                    }
                    if ((n % 10 == 0) && (n % 100 == 0) && ((n % 1000) != 0)) {
                        n = n / 100; //if the number is not a teen or somesort of ten then remove the first two digits( for the digits 1 and 100)
                    }
                    break;

                case 2:
                    if (n != 0 && (n % 10) != 0) { //for hundreds
                        words = ONES[((n % 10) - 1)] + BIGS[3] + words;
                        n = n / 10;
                    }
                    break;
            }
        }
        return words;
    }

}
