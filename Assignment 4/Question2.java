/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
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
            }
         
        }         
        return calc==number;
        
    }
    
    
        }
        
    
    /*
Output:
6 is a perfect number
28 is a perfect number
496 is a perfect number
*/

