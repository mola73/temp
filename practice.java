/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class practice {
    
    public static void main(String[]args){
        //for Q1
        double x= 6.1;
        double x2= 5.5;
        double x3= 10.8;
        System.out.println(x);
        System.out.println(rounding(x));
        System.out.println(x2);
        System.out.println(rounding(x2));
        System.out.println(x3);
        System.out.println(rounding(x3));
        
        // in a loop
        for(int i=0; i<10;i++){
            double d= (i+0.75)*2/3.5;
            System.out.println("The given numebr is " + d);
            System.out.println("The rounded number is " +rounding(d));
            System.out.println();
            
        }
    }
    
    /*
    Q1
    will round the number x to the nearest integer and assign the result to y.
Write an application that reads double values and uses the preceding
statement to round each of the numbers to the nearest integer. For each
number processed, display both the original number and the rounded
number.

    */
    
public static double rounding(double x){
double y= Math.floor(x+ 0.2);

return y;
}
           
           
    }
 


