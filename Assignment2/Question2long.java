/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unbccpscassignment2;

/**
 *
 * @author molaniyan
 */
//Name: Muhammad Alfatih Olaniyan
//Course:CPSC 100
//UNBC ID:230148724
import java.util.Scanner;
public class Question2long {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter the length");
        int length= sc.nextInt();
        
        System.out.println("Please enter the width");
        int width= sc.nextInt();
        
        System.out.println("Would you like to pay in one, two, or weekly installments\n Please input: \n \"one\" or \n \"two\" or \n \"weekly\" \n with no caps or spaces");
        String payrate= sc.next();
        //Scanners to input necessary information
        double seasonalcost;
        int squarefootage= length * width;
        double totalcost;
        int wmc;
         String one= "one";
         String two= "two";
         String weekly= "weekly";
         
        
        
        if(squarefootage <4000){
         wmc=55;
        
                 if (payrate.equals (one)){
        seasonalcost=20*wmc;
       System.out.println("You have chosen one payment");
       System.out.printf("The length is %d and the width is %d \n",length,width);
       //print length and width given
            System.out.printf("The weekly charge is $%d \n", wmc);
                 // print weekly charge.
 System.out.printf("seasonal cost is %f", seasonalcost);
 //print the seasonal cost aka total cost for the 20 weeks
   }else
       if(payrate.equals(two)){ 
           seasonalcost= (20*wmc)/2 + 5;
           //initializing the seasonal cost in a new scope and updating it by spliting it in two and adding 5 as a supplemental payment
           totalcost= seasonalcost *20;
           System.out.printf("The length is %d and the width is %d \n",length,width);
           //print length and width
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
                 // print length and width and weekly charge.
                 for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);
                 }
                 

            System.out.printf("The total cost is $%f", totalcost);
           }
           else
               System.out.println("SYNTAX ERROR, please input again");
        }

        if( squarefootage>=4000 && squarefootage< 6000){
                wmc=65;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width
// 

                 if (payrate.equals(one)){
        seasonalcost=20*wmc;
        totalcost= seasonalcost;
       System.out.println("You have chosen one payment");
 System.out.printf("seasonal cost is $%f \n", seasonalcost);
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing seasonal and total cost, and how many payment intervals requested
    }else
       if(payrate.equals(two)){
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;//divide cost inot two and add 5 as tax.
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost + ", Including a $5 fee");
           System.out.println("The second payment is $"+seasonalcost+ ", Including a $5 fee");
           System.out.println("The total cost is $"+ totalcost);
       }else
           if (payrate.equals(weekly)){
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
             } else
                 System.out.println("SYNTAX ERROR, please input pay rate again");
        }  
        //
        //
               if(squarefootage>=6000 && squarefootage<= 9000){
           
                wmc= 70;
               System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                   //print weekly charge and length and width
                 if (one.equals (payrate)){
        seasonalcost=20*wmc;
       System.out.println("You have chosen one payment");
   System.out.printf("seasonal cost is $%f", seasonalcost);
                      // Printing amount of payments and amount
 
   }else
       if(payrate.equals(two)){
           seasonalcost=20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost+ ", Including a $5 fee");
           System.out.println("The second payment is $" +seasonalcost+ ", Including a $5 fee");    
           System.out.println("The total cost is $"+ totalcost);      
           //printing number of payments, each of their amounts, and the total amount
       }else
           if (payrate.equals(weekly)){
               seasonalcost=20*wmc;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost * 20;
               for(int i= 1; i<=20;i++){
                   System.out.println("Week number "+ i +" cost is  $"+ seasonalcost+", Includinga a $5 service fee");
               }
               System.out.println("The total cost is $"+ totalcost);
           } else
               System.out.println("SYNTAX ERROR, please input again");
               }
                if(squarefootage>9000){
                System.out.println("No service");
                
                }
                
           }
       }        

/*
Output:
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
You have chosen one payment
The length is 10 and the width is 10 
The weekly charge is $55 
seasonal cost is 1100.000000

//
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
The weekly charge is $55 
You have chosen two payments
The first payment is $555.0 with a $5 fee included
The second payment is $ 555.0 with a $5 fee included
The total cost is $11100.000000

//

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

square footage is less than 60 and more or equal to 400

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
The weekly charge is $65 
You have chosen one payment
seasonal cost is $1300.000000 
The totalcost is $1300.000000 

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
The weekly charge is $65 
You have chosen two payments
The first payment is $655.0, Including a $5 fee
The second payment is $655.0, Including a $5 fee
The total cost is $13100.0

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
 The total cost is $1360.0

Square footage is from 6000 to 9000

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
The weekly charge is $70 
You have chosen one payment
seasonal cost is $1400.000000

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
two
The length is 600 and the width is 10 
The weekly charge is $70 
You have chosen two payments
The first payment is $705.0, Including a $5 fee
The second payment is $705.0, Including a $5 fee
The total cost is $14100.0

Please enter the length
600
Please enter the width
11
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
weekly
The length is 600 and the width is 11 
The weekly charge is $70 
Week number 1 cost is  $73.0, Includinga a $5 service fee
Week number 2 cost is  $73.0, Includinga a $5 service fee
Week number 3 cost is  $73.0, Includinga a $5 service fee
Week number 4 cost is  $73.0, Includinga a $5 service fee
Week number 5 cost is  $73.0, Includinga a $5 service fee
Week number 6 cost is  $73.0, Includinga a $5 service fee
Week number 7 cost is  $73.0, Includinga a $5 service fee
Week number 8 cost is  $73.0, Includinga a $5 service fee
Week number 9 cost is  $73.0, Includinga a $5 service fee
Week number 10 cost is  $73.0, Includinga a $5 service fee
Week number 11 cost is  $73.0, Includinga a $5 service fee
Week number 12 cost is  $73.0, Includinga a $5 service fee
Week number 13 cost is  $73.0, Includinga a $5 service fee
Week number 14 cost is  $73.0, Includinga a $5 service fee
Week number 15 cost is  $73.0, Includinga a $5 service fee
Week number 16 cost is  $73.0, Includinga a $5 service fee
Week number 17 cost is  $73.0, Includinga a $5 service fee
Week number 18 cost is  $73.0, Includinga a $5 service fee
Week number 19 cost is  $73.0, Includinga a $5 service fee
Week number 20 cost is  $73.0, Includinga a $5 service fee
The total cost is $1460.0

Over 9000
Please enter the length
1000
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "one" or 
 "two" or 
 "weekly" 
 with no caps or spaces
one
No service

*/
     
      
    

