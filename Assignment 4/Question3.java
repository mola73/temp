/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */import java.util.ArrayList;
import java.util.Scanner;
public class Question3 {
    public static void main(String[]args){
        ArrayList <Double> inputs = new ArrayList <Double>();
        boolean neg;
        Scanner reader= new Scanner(System.in);
        System.out.println("Are you an In or Out patient");
                System.out.println("Please input either \"In\" or \"Out\" ");
               String patient= reader.nextLine();
               if(patient.equals("In")){
                   
                  double numdays= sanitation("Please input the number for days you stayed at the hospital");
                    // method call to input anumvber and make sure it is greater than 0
                                     
                  double dailyrate= sanitation("Please input the daily rate of the hospital");
                           // method call to input anumvber and make sure it is greater than 0
                      
                           double medcharges= sanitation("Please input the medication charges please");
                                   // method call to input anumvber and make sure it is greater than 0
                                   
                               double hospservices=sanitation("Please input the hospital services fee please");
                                           // method call to input anumvber and make sure it is greater than 0
                                               
                                           System.out.printf("Your Total is: $%,.2f" , Total(numdays, dailyrate, medcharges, hospservices));
                                          
//
                                             
                   // inpateint method
               }
               else if(patient.equals("Out")){
                   //outpatient method
               double  medcharges= sanitation("Please input the medication charges please");
                    
                            double hospservices=sanitation("Please input the hospital services please");
                                           
                                           
                                           System.out.printf("Your Total is: $%,.2f" , Total( medcharges, hospservices));
               }
    }
        
    public static double Total(double numdays, double dailyrate, double medcharges, double hospservices){
       
        double Total;
       Total=(numdays * dailyrate)+ medcharges+ hospservices;
           return Total;
       }
       public static double Total(double medcharges, double hospservices){
        double Total;
        Total= medcharges+ hospservices;
        return Total;
    }
    public static double sanitation(String x){
       Scanner sc= new Scanner(System.in);
        
       System.out.println(x);
       double num=sc.nextDouble();
       
       while(num<0){
           System.out.println(x);
           num=sc.nextDouble();

       }
              return num;
    }
        
}

/*
Output:
Are you an In or Out patient
Please input either "In" or "Out" 
In
Please input the number for days you stayed at the hospital
10
Please input the daily rate of the hospital
-1
Please input the daily rate of the hospital
-2
Please input the daily rate of the hospital
-3
Please input the daily rate of the hospital
10
Please input the medication charges please
12
Please input the hospital services fee please
157
Your Total is: $269.00

Are you an In or Out patient
Please input either "In" or "Out" 
Out
Please input the medication charges please
10
Please input the hospital services please
-5
Please input the hospital services please
-10
Please input the hospital services please
124
Your Total is: $134.00

*/
        
    

