/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[]args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Are you an In or Out patient");
                System.out.println("Please input either \"In\" or \"Out\" ");
               String patient= reader.nextLine();
               if(patient.equals("In")){
                   
                   System.out.println("Please input the numbe for days you stayed at the hospital");
                    int numdays=reader.nextInt();
                                     
                   System.out.println("Please input the daily rate of the hospital");
                           double dailyrate=reader.nextDouble();
                           
                             System.out.println("Please input the medication charges please");
                                   double medcharges= reader.nextDouble();
                                   
                                      System.out.println("Please input the hospital services please");
                                           double hospservices= reader.nextDouble();
                                           
                                           System.out.printf("Your Total is: $ %,.2f", Total(numdays,dailyrate, medcharges,hospservices));
                   // inpateint method
               }
               else if(patient.equals("Out")){
                   //outpatient method
                   System.out.println("Please input the medication charges please");
                   double medcharges= reader.nextDouble();
                                   System.out.println("Please input the hospitl services please");
                                           double hospservices= reader.nextDouble();
                                           
                                           System.out.printf("Your Total is: $%,.2f" , Total( medcharges, hospservices));
               }
    }
        
    public static double Total(int numdays, double dailyrate, double medcharges, double hospservices){
        double Total;
       Total=(numdays * dailyrate)+ medcharges+ hospservices;
     //  try{Total
       
    //   }catch(Total<0){
           
       }
       
        return Total;
    }
    
    public static double Total(double medcharges, double hospservices){
        double Total;
        Total= medcharges+ hospservices;
        return Total;
    }
    
    }

/*
Output:
Are you an In or Out patient
Please input either "In" or "Out" 
In
Please input the numbe for days you stayed at the hospital
10
Please input the daily rate of the hospital
20
Please input the medication charges please
720.52
Please input the hospital services please
150
Your Total is: $1070.52


Are you an In or Out patient
Please input either "In" or "Out" 
Out
Please input the medication charges please
720.26848
Please input the hospitl services please
150
Your Total is: $870.27


*/