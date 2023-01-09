/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class NumToString {
    //private so it won't be acessed, static so that it owt form an object, final so it wont be changed

    private static final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigs = {"hundred", "thousand", "million"};

//    private static final String[] billion={"one billion"};
    //use counter to correspond arrays with each digit.
    //use a counter to find out the place of each number, if it is 999_000_000 let the code go to the 999 by counting up to it an printing it.
    public static String numbtoString(int n) {
String word= numbToStringhund(n)+numbToStringthous(n);
        return word;
    }

    public static String numbToStringhund(int n) {
        int num = n;
        int counter = 0;
        String words = nu;
        if (n != 0 && counter == 0) {//if at the start of the number
            words = ones[(n % 10) - 1];

            if (n != 0 && counter == 1) {
                if (((n % 100) / 10) == 1) { //if it is inbetween11 and 19
                    words = teens[(n % 10)];
                    ++counter;
                    ++counter;
                    n = n / 100;
                    if (n != 0 && counter == 2) { //for hundreds, counter becomes 3
                        words = ones[(n % 10) - 1] + " " + bigs[0] + " " + words;
                        ++counter;
                        n = n / 10;
                    }
                } else if (((n % 100) / 10) > 1) {//if it is above 19
                    words = tens[(n % 10) - 1] + words;
                    ++counter;
                    ++counter;
                    n = n / 100;
                    if (n != 0 && counter == 2) { //for hundreds, counter becomes 3
                        words = ones[(n % 10) - 1] + " " + bigs[0] + " " + words;
                        ++counter;
                        n = n / 10;
                    }
                }

            }

        }

        return words;

    }

    public static String numbToStringthous(int n) {
        int num = n / 1000;
        int counter = 0;
        String words = " ";
        if (num != 0 && counter == 0) {//if at the start of the number
            words = ones[(n % 10) - 1];

            if (num != 0 && counter == 1) {
                if (((num % 100) / 10) == 1) { //if it is inbetween11 and 19
                    words = teens[(num % 10)];
                    ++counter;
                    ++counter;
                    num = num / 100;

                    if (num != 0 && counter == 2) { //for hundreds, counter becomes 3
                        words = ones[(num % 10) - 1] + " " + bigs[0] + " " + words;
                        ++counter;
                        num = num / 10;
                    }

                } else if (((num % 100) / 10) > 1) {//if it is above 19
                    words = tens[(n % 10) - 1] + words;
                    ++counter;
                    ++counter;
                    num = num / 100;

                    if (num != 0 && counter == 2) { //for hundreds, counter becomes 3
                        words = ones[(num % 10) - 1] + " " + bigs[0] + " " + words;
                        ++counter;
                        num = num / 10;
                    }

                }

            }

        }

        return words;

    }

}
