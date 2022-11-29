/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
HOW DO I MAKE 20% OF THE SEATS FILLED?
Are arrays better or arraylist?
Make seats rndom, not this
*/
/**
 *
 * @author muham
 */
import java.util.Arrays;
import java.security.SecureRandom;
import java.util.Scanner;
public class Question2 {
    public static void main(String[]args){
            SecureRandom Random=new SecureRandom();
        int[][] bus = new int[10][6];
        int x;
        int y;
        int count=0;
       while(count<=12){
            x= Random.nextInt(6);
            y= Random.nextInt(10);  
       while(bus[y][x]!=1){
                    bus[y][x]=1;
            System.out.printf("%3d %3d", x,y);
             count+=1;
        }       
       }
        Display(bus);
        
                      
//                
//        Scanner Reader= new Scanner(System.in);
//        System.out.println("Would you like First class or Economy");
//        System.out.println("Please write F for Frist class or E for Economy class");  
//       String c= Reader.nextLine();
     
        


    }
        
    
    public static void Display(int[][] bus){

        for(int i=0; i<bus.length; i++){
//            
            for(int j=0; j<bus[i].length;j++){
             
                if(j==2){
                    System.out.print(bus[i][2]+"   ");
                }else{
                    System.out.print(bus[i][j]+" ");
                }
            
                //This is for the aisle
        }
        System.out.println();
    }   
    }
    
    
}