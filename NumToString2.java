/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class NumToString2 {

    private static final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigs = {"hundred", "thousand", "million"};

    public static String numbToStringhund(int n) {
        String words = null;
        for (int counter = 0; counter < 3; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {
                        words = ones[(n % 10) - 1];

                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && n != 0) { //if it is inbetween11 and 19
                        words = teens[(n % 10)];

                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = tens[((n % 100) / 10) - 2] + words;

                        n = n / 100;
                    }
                    break;

                case 2:
                    if (n != 0 && n != 0) { //for hundreds
                        words = ones[(n % 10) - 1] + " " + bigs[0] + " and " + words;
                        n = n / 10;
                    }
                    break;
            }
        }
        return words;
    }

    public static String numbToStringthous(int n) {
        String words = null;

        for (int counter = 0; counter < 6; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {
                        words = ones[(n % 10) - 1];

                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && n != 0) { //if it is inbetween11 and 19
                        words = teens[(n % 10)];

                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = tens[((n % 100) / 10) - 2] + words;

                        n = n / 100;
                    }
                    break;

                case 2:
                    if (n != 0 && counter == 2 && n != 0) { //for hundreds
                        words = ones[(n % 10) - 1] + " " + bigs[0] + " and " + words;
                        n = n / 10;
                    }
                    break;
                case 3:
                    if (n != 0 && (n % 10)!= 0 && (((n%100)/10)!=1)) {//for thousand singl digits
                        words = ones[(n % 10) - 1] + " " + bigs[1] + " " + words;
                    }

                    break;
                case 4:
                    if (((n % 100) / 10) == 1 && n != 0) { //for thousands if it is inbetween11 and 19
                        words = teens[(n % 10)]+ " "+ bigs[1] + " " + words;
                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {// for thousands if it is above 19
                        words = tens[((n % 100) / 10) - 2] + words;

                        n = n / 100;
                    }
                    break;
                case 5:
                    if (n != 0 && n != 0) { //for thousands in hundreds
                        words = ones[(n % 10) - 1] + " " + bigs[0] + " and " + words;
                        n = n / 10;
                        
                        //in this part put applications for hundred as teens and tens in the thousands
                        //should i seperat the methods or just make a a long one method? method hund, methid thous, method mill...
                    }
                    break;
            }
        }
        return words;
    }

}
