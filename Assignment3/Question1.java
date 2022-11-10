/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
public class Question1 {
    public static void main(String[]args){
        double money= 10_000;
        //drop 10 month 1
        //raise 10 month 2
        //6 raise and 6 drop every year
        // use 3 for loops
        // outer for each year
        //2nd for each drop
        //3rd for each raise
        //one drop for one raise
        
        
        // 
        for(int year=0; year<5; year++){ 
        for(int month= 1;month <=12; month++){
            if(month%2==1){
                money= money-(money/10);
                //This removes 10% from the first of every pair of months aka month 1,3,5...
            } else if(month%2==0){
                money= money+(money/10);
                //This increases by 10% from the 2nd of every pair of months aka 2,4,6,...
            }
        }
        System.out.println();
        System.out.printf("The money in year %d is %.2f %n",year,money);
        System.out.println();
        //This prints the money in the fund at the end of every year
        }
    
}
}
/*

Output:
The money in year 1 is 9414.80 


The money in year 2 is 8863.85 


The money in year 3 is 8345.14 


The money in year 4 is 7856.78 


The money in year 5 is 7397.00 

*/
