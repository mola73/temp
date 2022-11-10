package com.mycompany.unbccpscassignment2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
//Name: Muhammad Alfatih Olaniyan
//Course:CPSC 100
//UNBC ID:230148724
import java.util.Scanner;
public class Question3{
    public static void main(String[]args){
Scanner sc= new Scanner (System.in);
        System.out.println("Please enter the length");
        int length= sc.nextInt();
        
        System.out.println("Please enter the width");
        int width= sc.nextInt();
        
        System.out.println("Would you like to pay in one, two, or weekly installments\n Please input: \n \"1\" or \n \"2\" or \n \"20\" ");
        int payrate= sc.nextInt();
        double seasonalcost;
        int squarefootage= length * width;
        double totalcost;
        int wmc;
         
         
         
         switch(squarefootage/1000){
             case 0:
                 wmc=55;
               
                   switch (payrate){
                       case 1:
        seasonalcost=20*wmc;
       System.out.println("You have chosen one payment");
       System.out.printf("The length is %d and the width is %d \n",length,width);
       //print length and width given
            System.out.printf("The weekly charge is $%d \n", wmc);
                 // print weekly charge.
 System.out.printf("seasonal cost is %f", seasonalcost);
 //print the seasonal cost aka total cost for the 20 weeks
   break;
             case 2 :
                wmc=55;
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
           break;
           
             case 20:
                 seasonalcost=20*wmc;
               seasonalcost = (seasonalcost/20) +3;
               //reinitializing the seasonal cost and updating it for weekly payments
               totalcost= seasonalcost *20;
               System.out.printf("The length is %d and the width is %d \n",length,width);
            System.out.printf("The weekly charge is $%d \n", wmc);
            System.out.println("You have selected weekly payment");
                 // print length and width and weekly charge.
                 for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);
                 }
            System.out.printf("The total cost is $%f", totalcost);
            break;
                   }
                   break;
                 
                   ///
                   ///
                   //
             case 1:
                 wmc=55;
                   switch (payrate){
                       case 1:
        seasonalcost=20*wmc;
       System.out.println("You have chosen one payment");
       System.out.printf("The length is %d and the width is %d \n",length,width);
       //print length and width given
            System.out.printf("The weekly charge is $%d \n", wmc);
                 // print weekly charge.
 System.out.printf("seasonal cost is %f", seasonalcost);
 //print the seasonal cost aka total cost for the 20 weeks
   break;
             case 2 :
                wmc=55;
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
           break;
           
             case 20:
                 seasonalcost=20*wmc;
               seasonalcost = (seasonalcost/20) +3;
               //reinitializing the seasonal cost and updating it for weekly payments
               totalcost= seasonalcost *20;
               System.out.printf("The length is %d and the width is %d \n",length,width);
            System.out.printf("The weekly charge is $%d \n", wmc);
            System.out.println("You have selected weekly payment");
                 // print amount of payments, length and width, and weekly charge.
                 for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);
                 }
                 
            System.out.printf("The total cost is $%f", totalcost);
            break;
                   }
                   break;
                   
                   ///
                   ///
             case 2:
                 wmc=55;
                   switch (payrate){
                       case 1:
        seasonalcost=20*wmc;
       System.out.println("You have chosen one payment");
       System.out.printf("The length is %d and the width is %d \n",length,width);
       //print length and width given
            System.out.printf("The weekly charge is $%d \n", wmc);
                 // print weekly charge.
 System.out.printf("seasonal cost is %f", seasonalcost);
 //print the seasonal cost aka total cost for the 20 weeks
   break;
             case 2 :
                wmc=55;
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
           break;
           
             case 20:
                 seasonalcost=20*wmc;
               seasonalcost = (seasonalcost/20) +3;
               //reinitializing the seasonal cost and updating it for weekly payments
               totalcost= seasonalcost *20;
               System.out.printf("The length is %d and the width is %d \n",length,width);
            System.out.printf("The weekly charge is $%d \n", wmc);
            System.out.println("You have selected weekly payment");
                 // print payrate, length and width, and weekly charge.
                 for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);
                 }
                 
            System.out.printf("The total cost is $%f", totalcost);
            break;
                   }
                   break;
                   
//                ///
//            //
//            //
//                 
             case 3:
                 wmc=55;
                   switch (payrate){
                       case 1:
        seasonalcost=20*wmc;
       System.out.println("You have chosen one payment");
       System.out.printf("The length is %d and the width is %d \n",length,width);
       //print length and width given
            System.out.printf("The weekly charge is $%d \n", wmc);
                 // print weekly charge.
 System.out.printf("seasonal cost is %f", seasonalcost);
 //print the seasonal cost aka total cost for the 20 weeks
   break;
             case 2 :
                wmc=55;
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
           break;
           
             case 20:
                 seasonalcost=20*wmc;
               seasonalcost = (seasonalcost/20) +3;
               //reinitializing the seasonal cost and updating it for weekly payments
               totalcost= seasonalcost *20;
               System.out.printf("The length is %d and the width is %d \n",length,width);
            System.out.printf("The weekly charge is $%d \n", wmc);
            System.out.println("You have selected weekly payment");
                 // print pay rate, length and width, and weekly charge.
                 for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);
                 }
                 
            System.out.printf("The total cost is $%f", totalcost);
            break;
                   }
                 break;
                 //
                 //
                 //
                 //
             case 4:
                 wmc=65;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width

                 switch(payrate){
             case 1:
        seasonalcost=20*wmc;
        totalcost= seasonalcost *20;
       System.out.println("You have chosen one payment");
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing  total cost, and how many payment intervals requested
    break;
             case 2:
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost);
           System.out.println("The second payment is $"+seasonalcost);
           System.out.println("The total cost is $"+ totalcost);
           // Printing number of pyments, each payment amount, and the total.
       break;
             case 20:
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               System.out.println("You have selected weekly payment");
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
               //printing pay rate, number of payemnts/ their price, and total
             break;
             
             default:  System.out.println("SYNTAX ERROR, please input pay rate again");
           break;
        }  
                   break;
           // //
           // //       
           // //                         
        
                case 5:   
  
                 wmc=65;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width

                 switch(payrate){
             case 1:
        seasonalcost=20*wmc;
        totalcost= seasonalcost *20;
       System.out.println("You have chosen one payment");
 
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing total cost, and how many payment intervals requested
    break;
             case 2:
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost);
           System.out.println("The second payment is $"+seasonalcost);
           System.out.println("The total cost is $"+ totalcost);
           //printing pay rate, number of payemnts/ their price, and total
       break;
             case 20:
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               System.out.println("You have selected weekly payment");
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
             break;
             //printing pay rate, number of payemnts/ their price, and total
             
             default:  System.out.println("SYNTAX ERROR, please input pay rate again");
           break;
        }  
                   break;
                case 6:
                   
                 wmc=70;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width

                 switch(payrate){
             case 1:
        seasonalcost=20*wmc;
        totalcost= seasonalcost *20;
       System.out.println("You have chosen one payment");
 
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing total cost, and how many payment intervals requested
    break;
             case 2:
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost);
           System.out.println("The second payment is $"+seasonalcost);
           System.out.println("The total cost is $"+ totalcost);
           //printing pay rate, number of payemnts/ their price, and total
       break;
             case 20:
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               System.out.println("You have selected weekly payment");
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
             break;
             //printing pay rate, number of payemnts/ their price, and total
             
             default:  System.out.println("SYNTAX ERROR, please input pay rate again");
           break;
        }  
                   break;
                   
                case 7:
                      
                 wmc=70;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width

                 switch(payrate){
             case 1:
        seasonalcost=20*wmc;
        totalcost= seasonalcost *20;
       System.out.println("You have chosen one payment");
 
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing total cost, and how many payment intervals requested
    break;
             case 2:
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost);
           System.out.println("The second payment is $"+seasonalcost);
           System.out.println("The total cost is $"+ totalcost);
           //printing pay rate, number of payemnts/ their price, and total
       break;
             case 20:
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               System.out.println("You have selected weekly payment");
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
             break;
             //printing pay rate, number of payemnts/ their price, and total
             
             default:  System.out.println("SYNTAX ERROR, please input pay rate again");
           break;
                 }
                 break;
                    
                case 8:
                      
                 wmc=70;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width

                 switch(payrate){
             case 1:
        seasonalcost=20*wmc;
        totalcost= seasonalcost *20;
       System.out.println("You have chosen one payment");
 
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing total cost, and how many payment intervals requested
    break;
             case 2:
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost);
           System.out.println("The second payment is $"+seasonalcost);
           System.out.println("The total cost is $"+ totalcost);
           //printing pay rate, number of payemnts/ their price, and total
       break;
             case 20:
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               System.out.println("You have selected weekly payment");
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
             break;
             //printing pay rate, number of payemnts/ their price, and total
             
             default:  System.out.println("SYNTAX ERROR, please input pay rate again");
           break;
                 }
                 break;
                    
                case 9:
                    
                  switch(squarefootage){
                      case 9000:
                          wmc=70;
                System.out.printf("The length is %d and the width is %d \n",length,width);
                 System.out.printf("The weekly charge is $%d \n", wmc);
                 //Print weekly charge/ length and width

                 switch(payrate){
             case 1:
        seasonalcost=20*wmc;
        totalcost= seasonalcost *20;
       System.out.println("You have chosen one payment");
 
 System.out.printf("The totalcost is $%f \n", totalcost);
// //Printing total cost, and how many payment intervals requested
    break;
             case 2:
          seasonalcost= 20*wmc;
           seasonalcost= 0.5*seasonalcost + 5;
           totalcost= seasonalcost *20;
           System.out.println("You have chosen two payments");
           System.out.println("The first payment is $" + seasonalcost);
           System.out.println("The second payment is $"+seasonalcost);
           System.out.println("The total cost is $"+ totalcost);
           //printing pay rate, number of payemnts/ their price, and total
       break;
             case 20:
               seasonalcost= wmc*20;
               seasonalcost = (seasonalcost/20) +3;
               totalcost= seasonalcost *20;
               System.out.println("You have chosen weekly payment");
               for(int i=1; i<=20; i++){
                     System.out.printf("Week Number %d payment is $%f with a $3 fee included \n ", i,seasonalcost);       
       }
               System.out.println("The total cost is $"+totalcost);
             break;
             //printing pay rate, number of payemnts/ their price, and total
             default:  System.out.println("SYNTAX ERROR, please input pay rate again");
            
          
                 }
                
                     break;
         
    }
                default: System.out.println("No service for any square footage above 9000");
                    // To inform the user that if the square footage is above 9000 the calculations do not apply
                  
                  }
    
         /*
         
         Output:
          squarefootage is less than 4000
         Please enter the length
10
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
1
You have chosen one payment
The length is 10 and the width is 10 
The weekly charge is $55 
seasonal cost is 1100.000000
         
         Please enter the length
10
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
2
The length is 10 and the width is 10 
The weekly charge is $55 
You have chosen two payments
The first payment is $555.0 with a $5 fee included
The second payment is $ 555.0 with a $5 fee included
The total cost is $11100.000000
         
         
         Please enter the length
10
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
20
The length is 10 and the width is 10 
The weekly charge is $55 
You have selected weekly payment
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
         
         
          Please enter the length
400
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
1
The length is 400 and the width is 10 
The weekly charge is $65 
You have chosen one payment
The totalcost is $26000.000000  
         
         Please enter the length
400
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
2
The length is 400 and the width is 10 
The weekly charge is $65 
You have chosen two payments
The first payment is $655.0
The second payment is $655.0
The total cost is $13100.0
         
         
         Please enter the length
400
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
20
The length is 400 and the width is 10 
The weekly charge is $65 
You have selected weekly payment
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
         Square footage is greaTER THAN 600 BUT LESS THAN OR EQUAL TO 9000
         
         Please enter the length
600
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
1
The length is 600 and the width is 10 
The weekly charge is $70 
You have chosen one payment
The totalcost is $28000.000000 
         
         
         Please enter the length
700
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
2
The length is 700 and the width is 10 
The weekly charge is $70 
You have chosen two payments
The first payment is $705.0
The second payment is $705.0
The total cost is $14100.0
         
         Please enter the length
800
Please enter the width
10
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
20
The length is 800 and the width is 10 
The weekly charge is $70 
You have selected weekly payment
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
 The total cost is $1460.0
         
         ABOVE 9000
         Please enter the length
900
Please enter the width
12
Would you like to pay in one, two, or weekly installments
 Please input: 
 "1" or 
 "2" or 
 "20" 
1
No service for any square footage above 9000
         */
      
       
}
}

