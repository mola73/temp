/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
public class numbToStrings {
    //private so it won't be acessed, static so that it owt form an object, final so it wont be changed

    private static final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigs = {"hundred", "thousand", "million"};

//    private static final String[] billion={"one billion"};
    //use counter to correspond arrays with each digit.
    //use a counter to find out the place of each number, if it is 999_000_000 let the code go to the 999 by counting up to it an printing it.
    public static String numbtoString(int n) {
        int digitcount = 0;
        int num = n;
        int counter = 0;
        String words = " ";
        
            if (n!=0 &&counter == 0) {//if at the start of the number
                words = ones[(n % 10) - 1];
                counter++;
                  if(n!=0 && counter == 1){
                if ( ((n % 100) / 10) == 1) { //if it is inbetween11 and 19
                    words = teens[(n % 10)];
                    ++counter;
                    ++counter;
                    n = n / 100;
                } else if (((n % 100) / 10) > 1) {//if it is above 19
                    words = tens[(n % 10) - 1] + words;
                    ++counter;
                    ++counter;
                    n = n / 100;
                }
                if (n!=0 && counter == 2) { //for hundreds, counter becomes 3
                    words = ones[(n % 10) - 1] + " " + bigs[0] + " " + words;
                    ++counter;
                    n = n / 10;

                if (n!=0 &&counter == 3) {// 1 thousand to 9thousand counter beocmes 4
                words = ones[(n % 10) - 1];
                counter++;
                n=n/10;
                }
                else if (n!=0 && counter == 3 && ((n % 100) / 10) == 1) { //{//for10 thosuand to 19 thousand thousands counter gores form 3 to 5
                    words = teens[(n % 10)] + " " + bigs[1] + " " + words;
                    ++counter;
                    ++counter;
                    n = n / 100;
            } else if (counter == 1 && ((n % 100) / 10) > 1) {//if it is above 19
                words = tens[((n % 100)/10) - 1] + " " +ones[n%10-1]+" " + bigs[1] + " " + words;
                counter++;
                n = n / 100;
                }
                }
                
                  }
                
            }
        

        return words;

    }
}
