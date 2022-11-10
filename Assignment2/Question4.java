/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.unbccpscassignment2;
import java.util.Scanner;

//Name: Muhammad Alfatih Olaniyan
//Course:CPSC 100
//UNBC ID:230148724

/**
 *
 * @author molaniyan
 */
public class Question4 {
    public static void main (String [] args){
     Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the palindrone");
        int palindrone= scan.nextInt();
        int palindrone2= palindrone;
       int i;
      for( i=1;i<=5;i++){
          int num= palindrone/10;
          palindrone= num;
          // divides a 5 digit int by 10, 5 times, so it wil equal zero if it's 5 digits
          
          if(palindrone==0 && i!=5){
              System.out.println("The number is too small");
              System.out.println("Please enter the palindrone");
        palindrone= scan.nextInt();//This will allow the user to input a new number but not do anyhting
        break;
        //Checking if the number is too small
              // If the number is too small it wil reach zero before the counte(i) reaches zero
          }
          
          if(palindrone!=0 && i==5){
             System.out.println("The number is too large");
             System.out.println("Please enter the palindrone");
         palindrone= scan.nextInt(); // This will allow the user to input a new number but not do anyhting because the question did not ask usredo the action but  only to ask for another number
         break;
         //Checking if the number is too large
             //if the number is too large, it will not reach zero when the counter (i) reaches 5
          }
          
         
          if (palindrone==0 && i==5){
          System.out.println("The number is 5 digits");
         
          palindrone= palindrone2;
          // replace the modified value of palindrone with the original
          
               int p1= palindrone%10;
               System.out.printf("%d ", p1);
               
               palindrone= palindrone/10;
               int p2 = palindrone%10;
               System.out.printf("%d ", p2);
               
               palindrone=palindrone/10;
               int p3=palindrone%10;
               System.out.printf("%d ",p3);
               
               palindrone=palindrone/10;
               int p4= palindrone%10;
               System.out.printf("%d ",p4);
              
               palindrone=palindrone/10;
               int p5 =palindrone%10;
               System.out.printf("%d %n",p5 );
               
               //Perform the palindorme flip
               
               if(p1==p5 && p2==p4){
                   System.out.println("This is a plaindrone!");
               }else
                   System.out.println("This is not a palindrone");
           
      }
      }
        }
        
        
        /*
    Output:
    Please enter the palindrone
12321
The number is 5 digits
1 2 3 2 1 
This is a plaindrone!
    
    Please enter the palindrone
1
The number is too small
Please enter the palindrone
12
    
    
    Please enter the palindrone
112232211
The number is too large
Please enter the palindrone
1
    
    Please enter the palindrone
12345
The number is 5 digits
5 4 3 2 1 
This is not a palindrone
    
    Please enter the palindrone
55555
The number is 5 digits
5 5 5 5 5 
This is a plaindrone!
    */
}

