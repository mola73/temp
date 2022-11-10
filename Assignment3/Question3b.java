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
import java.util.Scanner;
public class Question3b {
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        System.out.println("Please inoput your financial goal");
        double fingoal= input.nextDouble();
        System.out.println("Please input Your Interest rate");
        double interestr= input.nextDouble();
        double Principal;
        double calc= 1+interestr;
        double result=1;
        
        for(int n=5; n<=30; n+=5){// for loop to loop through the differnt time duarations
            for (int i= 1; i <= n; i++){
    result = result* calc;
    
    // Doing the power of the (interest +1) to the number of years(n)
        }
            Principal= fingoal/result;
            System.out.printf("The  principal amount for %d years is %.5f %n",n,Principal);
    }
}
}
