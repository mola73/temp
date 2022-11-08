/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your grade please?");
        int grade= reader.nextInt();
        System.out.println("The GPA is " +gpa(grade));
        
    }
    
    public static int gpa(int avgrade){
        int gpa;
        switch(avgrade/10){
            case 9 :
              gpa = 4;
             break;
            case 8:
                gpa=3;
                break;
            case 7:
                gpa= 2;
                break;
            case 6:
                gpa= 1;
                break;
            default: gpa= 0;
                
                    
        }
        return gpa;
    }
}
