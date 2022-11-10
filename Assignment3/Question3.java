/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
//Name: Muhammad Alfatih Olaniyan
//Course: CPSC 100
//ID:230148724
public class Question3 {
  public static void main(String[]args){
 double amount;
 double principle= 1000;
 double interest= 5;
 int n= 10;
 double calc= 1+ (interest/100);
 
 double result =1;
 //Initializing variables
 
 for (int i= 1; i <= n; i++){
    result = result* calc;
    // Doing the power of the (interest +1) to the number of years(n)
    amount= principle * result;
    //multiplying p to the (1+r)^n
    System.out.printf("The amount for year %d is $%,.2f %n",i,amount);
    //Printing the amount after each year which is multiplied by the starting money or principle 
 }
 
  
}
}
/*

Output:
The amount for year 1 is $1,050.00 
The amount for year 2 is $1,102.50 
The amount for year 3 is $1,157.63 
The amount for year 4 is $1,215.51 
The amount for year 5 is $1,276.28 
The amount for year 6 is $1,340.10 
The amount for year 7 is $1,407.10 
The amount for year 8 is $1,477.46 
The amount for year 9 is $1,551.33 
The amount for year 10 is $1,628.89 
*/