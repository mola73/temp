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
    
    public static String numbToString(int n) { //MAIN METHOD WHICH CALLS METHODS BELOW
        int test= n;
        int counter=0;
        String words="";
        while(test!=0){//count the amount of digits in the given number
            test=test/10;
            ++counter;
        }
        if(counter<=3 && counter>0){
            words= numbToStringhund(n);
            return words;
        }
        if (counter<=6 && counter>3){
            words=numbToStringthous(n)+" "+numbToStringhund(n);
        return words;
        }
        if(counter<=9 && counter>6){
         words= numbToStringmill(n)+" "+numbToStringthous(n)+" "+numbToStringhund(n);
        return words;
    }
        return words;
    }
    


    public static String numbToStringhund(int n) {// THIS WORKS BUT STIL CHECK FIRST (The program is not printing the hundreds, fix that and apply to folowing programs
        String words = "";
        for (int counter = 0; counter <3; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {
                        words = ones[(n % 10) - 1];

                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && (n != 0) && ((n%100)/10) !=0) { //if it is in between11 and 19
                        words = teens[(n % 10)];
                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = tens[((n % 100) / 10) - 2] + " "+ words;

                        n = n / 100;
                    }
                   if((n%10==0)&&(n%100==0)){
                    n=n/100; //if the number is not a teen or somesort of ten then remove the first two digits( for the digits 1 and 100)
                } 
                    break;
//the code does not reach here for some reason.
                case 2:
                    if (n != 0 && (n%10)!=0) { //for hundreds
                        words = ones[((n % 10)- 1)] + " " + bigs[0] +" "+ words;
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
       n=n/1000;
      for (int counter = 0; counter <3; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {
                        words = ones[(n % 10) - 1];

                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && (n != 0) && ((n%100)/10) !=0) { //if it is in between11 and 19
                        words = teens[(n % 10)];
                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = tens[((n % 100) / 10) - 2] + " "+ words;

                        n = n / 100;
                    }
                   if((n%10==0)&&(n%100==0)){
                    n=n/100; //if the number is not a teen or somesort of ten then remove the first two digits( for the digits 1 and 100)
                } 
                    break;
//the code does not reach here for some reason.
                case 2:
                    if (n != 0 && (n%10)!=0) { //for hundreds
                        words = ones[((n % 10)- 1)] + " " + bigs[0] +" "+ words;
                        n = n / 10;
                    }
                    break;
            }
        }
        
        words= words + " "+ bigs[1];
        return words;
    }
    
    public static String numbToStringmill(int n) {// EDIT THIS( There is a problem with the tens and hundred case, it intersects witht the single case condition.
        String words="";
        n=n/1000000;
        for (int counter = 0; counter <3; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {
                        words = ones[(n % 10) - 1];

                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && (n != 0) && ((n%100)/10) !=0) { //if it is in between11 and 19
                        words = teens[(n % 10)];
                        n = n / 100;
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = tens[((n % 100) / 10) - 2] + " "+ words;

                        n = n / 100;
                    }
                   if((n%10==0)&&(n%100==0)){ //if it is 100,200, 300.....
                    n=n/100; //if the number is not a teen or somesort of ten then remove the first two digits( for the digits 1 and 100)
                } 
                    break;

                case 2:
                    if (n != 0 && (n%10)!=0) { //for hundreds
                        words = ones[((n % 10)- 1)] + " " + bigs[0] +" "+ words;
                        n = n / 10;
                    }
                    break;
            }
        }
        
        words= words + " "+ bigs[2];
       
        
        
        return words;
    }


}

   