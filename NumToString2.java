/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */

public class NumToString2 {

    private static final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigs = {"hundred", "thousand", "million"};
    
    public static String numbToString(int n) { //MAIN METHOD WHICH CALLS METHODS BELOW
        String words= numbToStringmill(n)+numbToStringthous(n)+numbToStringhund(n);
        return words;
    }
    


    public static String numbToStringhund(int n) {// THIS WORKS BUT STIL CHECK FIRST (check fois 100 and 1 work)
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

    public static String numbToStringthous(int n) {//EDIT THIS
        String words = null;
       final int ph=n;// to keep original for formatting problems

        for (int counter = 3; counter < 6; counter++) {
            switch (counter) {
                
                case 3:
                    if (n != 0 && (n % 10)!= 0 && (((n%100)/10)<1)) {//for thousand singl digits
                        words = ones[(n % 10) - 1] + " " + bigs[1] + " " + words;
                    }

                    break;
                case 4:
                    if (((n % 100) / 10) == 1 && n != 0) { //for thousands if it is inbetween11 and 19
                        words = teens[(n % 10)]+ " "+ bigs[1] + " " + words;
                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {// for thousands if it is above 19
                        words = tens[((n % 100) / 10) - 2]+ones[(n%10)-1] + bigs[1]+ " "+ words;

                        n = n / 100;
                    }
                    break;
               case 5:
                   if (n != 0 && n != 0) { //for thousands in hundreds
                        words = ones[(n % 10) - 1] + " " + bigs[0]+ " "+" and " + words;
                       n = n / 10;
                        
                        //in this part put applications for hundred as teens and tens in the thousands
                        //should i seperat the methods or just make a a long one method? method hund, methid thous, method mill...
                    }
                    break;
            }
        }
        return words;
    }
    
    public static String numbToStringmill(int n) {// EDIT THIS
        String words="";
        n=n/1000000;
        
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


}





























//public class NumToString2 {
//    //private so it won't be acessed, static so that it owt form an object, final so it wont be changed
//
//    private static final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//
//    private static final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//
//    private static final String[] bigs = {"hundred", "thousand", "million"};
//
////    private static final String[] billion={"one billion"};
//    //use counter to correspond arrays with each digit.
//    //use a counter to find out the place of each number, if it is 999_000_000 let the code go to the 999 by counting up to it an printing it.
//    public static String numbtoString(int n) {
//        int digitcount = 0;
//        int num = n;
//        int counter = 0;
//        String words = " ";
//        
//            if (n!=0 &&counter == 0) {//if at the start of the number
//                words = ones[(n % 10) - 1];
//                counter++;
//                  if(n!=0 && counter == 1){
//                if ( ((n % 100) / 10) == 1) { //if it is inbetween11 and 19
//                    words = teens[(n % 10)];
//                    ++counter;
//                    ++counter;
//                    n = n / 100;
//                } else if (((n % 100) / 10) > 1) {//if it is above 19
//                    words = tens[(n % 10) - 1] + words;
//                    ++counter;
//                    ++counter;
//                    n = n / 100;
//                }
//                if (n!=0 && counter == 2) { //for hundreds, counter becomes 3
//                    words = ones[(n % 10) - 1] + " " + bigs[0] + " " + words;
//                    ++counter;
//                    n = n / 10;
//
//                if (n!=0 &&counter == 3) {// 1 thousand to 9thousand counter beocmes 4
//                words = ones[(n % 10) - 1];
//                counter++;
//                n=n/10;
//                }
//                else if (n!=0 && counter == 3 && ((n % 100) / 10) == 1) { //{//for10 thosuand to 19 thousand thousands counter gores form 3 to 5
//                    words = teens[(n % 10)] + " " + bigs[1] + " " + words;
//                    ++counter;
//                    ++counter;
//                    n = n / 100;
//            } else if (counter == 1 && ((n % 100) / 10) > 1) {//if it is above 19
//                words = tens[((n % 100)/10) - 1] + " " +ones[n%10-1]+" " + bigs[1] + " " + words;
//                counter++;
//                n = n / 100;
//                }
//                }
//                
//                  }
//                
//            }
//        
//
//        return words;
//
//    }
//}
