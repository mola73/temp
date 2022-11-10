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
public class Question1 {
    public static void main(String[]args){
        double money= 10_000;
        
        for(int year=1; year<=5; year++){ 
            //loop for each year
        for(int month= 1;month  <=12; month++){
            //loop for each month
            if(month%2==1){
                money= money-(money/10);
                //This removes 10% from the first of every pair of monthsor odd months aka month 1,3,5...
            } else if(month%2==0){
                money= money+(money/10);
                //This increases by 10% from the 2nd of every pairor even months of months aka 2,4,6,...
            }
        }
        System.out.println();
        System.out.printf("The money in year %d is %,.2f %n",year,money);
        System.out.println();
        //This prints the money in the fund at the end of every year
        }
    
}
}
/*

Output:
The money in year 1 is 9,414.80 


The money in year 2 is 8,863.85 


The money in year 3 is 8,345.14 


The money in year 4 is 7,856.78 


The money in year 5 is 7,397.00 

*/
