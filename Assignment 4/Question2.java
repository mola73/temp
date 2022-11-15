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
//Course:CPSC 100
//UNBC ID:230148724
public class Question2 {
    public static void main(String[]args){
        for(int i= 1; i< 1000;i++){
            if(isPerfect(i)== true){
                System.out.println(i + " is a perfect number");
            }
        }
    }
    
    public static boolean isPerfect(int number){
        int calc=0;
      
        for(int i= 1; i<number; i++){
            if(number%i==0){
                calc= calc + i;
                // sum up numbers less than the given number
            }
         
        }         
        return calc==number;
        // reuturn true if the calculation is the the same as the given number, hence it is perfect.
        //Else it returns false
    }
    
    
        }
        
    
    /*
Output:
6 is a perfect number
28 is a perfect number
496 is a perfect number

*/

