/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author muham
 */
//Name: Muhammad Alfatih Olaniyan
//Course:CPSC 100
//UNBC ID:230148724

public class Question2 {
    public static void main(String[]args){
       Scanner sc= new Scanner (System.in);
        System.out.println("Please enter the length");
        int length= sc.nextInt();
        
        System.out.println("Please enter the width");
        int width= sc.nextInt();
        
        System.out.println("Would you like to pay in one, two, or weekly installments\n Please input: \n \"one\" or \n \"two\" or \n \"weekly\" \n with no caps or spaces");
        String payrate= sc.next();
        double seasonalcost;
        int squarefootage= length * width;
        double totalcost;
        int wmc=0;
         String one= "one";
         String two= "two";
         String weekly= "weekly";
         
         
         if(squarefootage>0){
             
            if (squarefootage< 4000){
                wmc=55;
            }else if(squarefootage>= 4000 && squarefootage<6000){
                wmc= 65;
                
            }else if(squarefootage>=6000 && squarefootage<=9000){
                wmc=70;
            }else{
                System.out.println("No service");
                
            }
           
 
  if (payrate.equals (one)){
      seasonalcost=20*wmc;
      System.out.printf("The length is %d and the width is %d \n",length,width);
       //print length and width given
       System.out.println("You have chosen one payment");
            System.out.printf("The weekly charge is $%d \n", wmc);
            System.out.printf("seasonal cost is %f", seasonalcost);
 //print the seasonal cost aka total cost for the 20 weeks
  }else 
      
      if(payrate.equals(two)){
 seasonalcost= (20*wmc)/2 + 5;
           //initializing the seasonal cost in a new scope and updating it by spliting it in two and adding 5 as a supplemental payment
           totalcost= seasonalcost *2;
           System.out.printf("The length is %d and the width is %d \n",length,width);
           //print length and width
            System.out.println("You have chosen two payments");
            System.out.printf("The weekly charge is $%d \n", wmc);
                 // print weekly charge.
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost+" with a $5 fee included");
           System.out.println("The second payment is $ "+ seasonalcost+" with a $5 fee included");
           //printing the cost into two different costs since the user chose two payments
           System.out.printf("The total cost is $%f", totalcost);
           //print total cost
           }else 
          
          
          if (payrate.equals(weekly)){
               seasonalcost=20*wmc;
               seasonalcost = (seasonalcost/20) +3;
               //reinitializing the seasonal cost and updating it for weekly payments
               totalcost= seasonalcost *20;
               System.out.printf("The length is %d and the width is %d \n",length,width);
            System.out.printf("The weekly charge is $%d \n", wmc);
            System.out.println("You have chosen weekly payment");
                 // print length and width and weekly charge.
                 for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);
                 }
                 
            System.out.printf("The total cost is $%f", totalcost);
           }else
              System.out.println("No service");
  
 
            
         }
      }
      }
          
/*
Output:

LESS THAN 4000 SQUAREFOOTAGE
Please enter the length
10
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
one
The length is 10 and the width is 10 
You have chosen one payment
The weekly charge is $55 
seasonal cost is 1100.000000


Please enter the length
10
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
two
The length is 10 and the width is 10 
You have chosen two payments
The weekly charge is $55 
You have chosen two payments
The first payment is $555.0 with a $5 fee included
The second payment is $ 555.0 with a $5 fee included
The total cost is $1110.000000


Please enter the length
10
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
weekly
The length is 10 and the width is 10 
The weekly charge is $55 
You have chosen weekly payment
Week Number 1 payment is $58.000000 with a $3 fee included 
 Week Number 2 payment is $58.000000 with a $3 fee included 
 Week Number 3 payment is $58.000000 with a $3 fee included 
 Week Number 4 payment is $58.000000 with a $3 fee included 
 Week Number 5 payment is $58.000000 with a $3 fee included 
 Week Number 6 payment is $58.000000 with a $3 fee included 
 Week Number 7 payment is $58.000000 with a $3 fee included 
 Week Number 8 payment is $58.000000 with a $3 fee included 
 Week Number 9 payment is $58.000000 with a $3 fee included 
 Week Number 10 payment is $58.000000 with a $3 fee included 
 Week Number 11 payment is $58.000000 with a $3 fee included 
 Week Number 12 payment is $58.000000 with a $3 fee included 
 Week Number 13 payment is $58.000000 with a $3 fee included 
 Week Number 14 payment is $58.000000 with a $3 fee included 
 Week Number 15 payment is $58.000000 with a $3 fee included 
 Week Number 16 payment is $58.000000 with a $3 fee included 
 Week Number 17 payment is $58.000000 with a $3 fee included 
 Week Number 18 payment is $58.000000 with a $3 fee included 
 Week Number 19 payment is $58.000000 with a $3 fee included 
 Week Number 20 payment is $58.000000 with a $3 fee included 
 The total cost is $1160.000000


FROM 4000 TO LEASS THAN 6000 SQUAREFOOTAGE

Please enter the length
400
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
one
The length is 400 and the width is 10 
You have chosen one payment
The weekly charge is $65 
seasonal cost is 1300.000000


Please enter the length
400
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
two
The length is 400 and the width is 10 
You have chosen two payments
The weekly charge is $65 
You have chosen two payments
The first payment is $655.0 with a $5 fee included
The second payment is $ 655.0 with a $5 fee included
The total cost is $1310.000000


Please enter the length
400
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
weekly
The length is 400 and the width is 10 
The weekly charge is $65 
You have chosen weekly payment
Week Number 1 payment is $68.000000 with a $3 fee included 
 Week Number 2 payment is $68.000000 with a $3 fee included 
 Week Number 3 payment is $68.000000 with a $3 fee included 
 Week Number 4 payment is $68.000000 with a $3 fee included 
 Week Number 5 payment is $68.000000 with a $3 fee included 
 Week Number 6 payment is $68.000000 with a $3 fee included 
 Week Number 7 payment is $68.000000 with a $3 fee included 
 Week Number 8 payment is $68.000000 with a $3 fee included 
 Week Number 9 payment is $68.000000 with a $3 fee included 
 Week Number 10 payment is $68.000000 with a $3 fee included 
 Week Number 11 payment is $68.000000 with a $3 fee included 
 Week Number 12 payment is $68.000000 with a $3 fee included 
 Week Number 13 payment is $68.000000 with a $3 fee included 
 Week Number 14 payment is $68.000000 with a $3 fee included 
 Week Number 15 payment is $68.000000 with a $3 fee included 
 Week Number 16 payment is $68.000000 with a $3 fee included 
 Week Number 17 payment is $68.000000 with a $3 fee included 
 Week Number 18 payment is $68.000000 with a $3 fee included 
 Week Number 19 payment is $68.000000 with a $3 fee included 
 Week Number 20 payment is $68.000000 with a $3 fee included 
 The total cost is $1360.000000

FROM 6000 UNTIL 9000  SQUAREFOOTAGE
Please enter the length
600
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
one
The length is 600 and the width is 10 
You have chosen one payment
The weekly charge is $70 
seasonal cost is 1400.000000


Please enter the length
900
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
two
The length is 900 and the width is 10 
You have chosen two payments
The weekly charge is $70 
You have chosen two payments
The first payment is $705.0 with a $5 fee included
The second payment is $ 705.0 with a $5 fee included
The total cost is $1410.000000


Please enter the length
600
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
weekly
The length is 600 and the width is 10 
The weekly charge is $70 
You have chosen weekly payment
Week Number 1 payment is $73.000000 with a $3 fee included 
 Week Number 2 payment is $73.000000 with a $3 fee included 
 Week Number 3 payment is $73.000000 with a $3 fee included 
 Week Number 4 payment is $73.000000 with a $3 fee included 
 Week Number 5 payment is $73.000000 with a $3 fee included 
 Week Number 6 payment is $73.000000 with a $3 fee included 
 Week Number 7 payment is $73.000000 with a $3 fee included 
 Week Number 8 payment is $73.000000 with a $3 fee included 
 Week Number 9 payment is $73.000000 with a $3 fee included 
 Week Number 10 payment is $73.000000 with a $3 fee included 
 Week Number 11 payment is $73.000000 with a $3 fee included 
 Week Number 12 payment is $73.000000 with a $3 fee included 
 Week Number 13 payment is $73.000000 with a $3 fee included 
 Week Number 14 payment is $73.000000 with a $3 fee included 
 Week Number 15 payment is $73.000000 with a $3 fee included 
 Week Number 16 payment is $73.000000 with a $3 fee included 
 Week Number 17 payment is $73.000000 with a $3 fee included 
 Week Number 18 payment is $73.000000 with a $3 fee included 
 Week Number 19 payment is $73.000000 with a $3 fee included 
 Week Number 20 payment is $73.000000 with a $3 fee included 
 The total cost is $1460.000000

OVER 9000

Please enter the length
900
Please enter the width
12
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
one
No service
The length is 900 and the width is 12 
You have chosen one payment
The weekly charge is $0 
seasonal cost is 0.000000
*/

