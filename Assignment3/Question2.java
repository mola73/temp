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
public class Question2 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Please input a non negative number that is less than 10");
      int d1= input.nextInt();
        
      
      System.out.println("Please input a non negative number that is less than 10");
        int d2= input.nextInt();
        int d3;
        int d12;
        int d22;
        d12=d1;
        d22=d2;
        
                
                
        while(d1 <0 || d1>9 ){
            System.out.println("Error");
            System.out.println("Please input a non negative number that is less than 10");
            d1= input.nextInt();
          // Detterent from errors          
        } 
           while(d2 <0||d2 >9){
        System.out.println("Error");
        System.out.println("Please input a non negative number that is less than 10");
        d2= input.nextInt();
        // Detterent from errors 
        }
           System.out.printf(" %d %d",d1, d2 );
           //print first two number
        do{
            d3=(d12+d22)%10;
            System.out.printf(" %d", d3);
            d12=d22;
            d22=d3;
        //print the rest of the numbers
            
        }while(d12!=d1 || d2!=d3);
    }
}

/*
Output:
Please input a non negative number that is less than 10
1
Please input a non negative number that is less than 10
8
 1 8 9 7 6 3 9 2 1 3 4 7 1 8
*/