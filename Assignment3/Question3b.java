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
import java.util.Scanner;
public class Question3b {
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        System.out.println("Please input your financial goal");
        double fingoal= input.nextDouble();
        System.out.println("Please input your Interest rate");
        double interestr= input.nextDouble();
        double Principal;
        double calc= (1+interestr/100);// this is the r+1
        double result=1;// number used to start power calculation
        
        for(int n=5; n<=30; n+=5){// for loop to loop through the differnt time duarations
            for (int j=1; j<=5; j++){//This loop does the power calculation
        result  = result*calc;
            }
            Principal= fingoal/result;// Final calcualtion(a/(1+r)^n)
            System.out.printf("The  principal amount for %d years is %,.2f %n",n,Principal);
    }
}
}

/*
Output:
Please input your financial goal
15000
Please input your Interest rate
6.6
The  principal amount for 5 years is 10,896.96 
The  principal amount for 10 years is 7,916.24 
The  principal amount for 15 years is 5,750.87 
The  principal amount for 20 years is 4,177.80 
The  principal amount for 25 years is 3,035.02 
The  principal amount for 30 years is 2,204.83 
*/