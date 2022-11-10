/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unbccpscassignment3;
/**
 *
 * @author molaniyan
 */
public class Question3 {
    public static void main(String[]args){
  double amount;
 double principle= 1000;
 double interest= 5;
 int n= /*10;*/ 10;
 double calc= 1+ interest;
 
 double result =1;
 //Initializing variables
 for (int i= 1; i <= n; i++){
    result = result* calc;
    // Doing the power of the interest +1 to the number of years(n)
    amount= principle * result;
    System.out.printf("The amount for year %d is %.2f %n",i,amount);
    //Printing the amount after each year which is multiplied by the starting money or principle 
 }
 
 
 
}
}
/*

Output:
The amount for year 1 is 6000.00 
The amount for year 2 is 36000.00 
The amount for year 3 is 216000.00 
The amount for year 4 is 1296000.00 
The amount for year 5 is 7776000.00 
The amount for year 6 is 46656000.00 
The amount for year 7 is 279936000.00 
The amount for year 8 is 1679616000.00 
The amount for year 9 is 10077696000.00 
The amount for year 10 is 60466176000.00 
*/