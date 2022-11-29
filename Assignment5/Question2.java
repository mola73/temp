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
        do{
            x= Random.nextInt(6);
            y= Random.nextInt(10);  
             bus[y][x]=1;
             
             
             
        }while(bus[y][x]!=0);
         Display(bus);
                      
//                
//        Scanner Reader= new Scanner(System.in);
//        System.out.println("Would you like First class or Economy");
//        System.out.println("Please write F for Frist class or E for Economy class");  
//       String c= Reader.nextLine();
     
        


    }
        
    
    public static void Display(int[][] Reservation){

        for(int i=0; i<Reservation.length; i++){
//            int count=0;
            for(int j=0; j<Reservation[i].length;j++){
             
                if(j==2){
                    System.out.print(Reservation[i][2]+"   ");
                }else{
                    System.out.print(Reservation[i][j]+" ");
                }
            
                //This is for the aisle
        }
        System.out.println();
    }
    }

}