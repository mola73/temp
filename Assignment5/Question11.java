/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//COMMENT THIS FILE BEFORE SUBMITTING!!!!!!!!!!!!!!!!!!!

import java.io.File;
import java.io.PrintWriter;


/**
 *
 * @author muham
 */
import java.util.Scanner;
import java.io.*;
public class Question11 {
    public static void main(String[]args)throws IOException{
        String inpath= "babynames.txt";
      
        File Namein= new File(inpath);
        
        File Nameout = new File("boynames.txt");
        File Nameout2= new File("girlnames.txt");
        
        System.out.println(Nameout.getAbsolutePath());
        
        if(Namein.exists()&& Nameout.exists()&& Nameout2.exists()){
            System.out.println(" Namein  and Nameout exist");
        }else{
            System.out.println("One of the files is not recognized");
        System.exit(0);
    }
        //Make sure the in and out files exist.
   
        
       Scanner scan= new Scanner(Namein); // tool  to take in values
       PrintWriter ofile= new PrintWriter(Nameout);// tool to print out values
       PrintWriter oofile= new PrintWriter(Nameout2);
       
       while(scan.hasNext()){
           String[] line= scan.nextLine().split("  ");
          ofile.println(line[0]+"  "+ line[1]+" "+ line[2]+" "+ line[3]);
          oofile.println(line[0]+" "+ line[4]+" "+ line[5]+" "+line[6]);
     
             
                             
          
          
               
           }

       scan.close();// close the scanner
       ofile.close();//close the printer
           
       }
       
    }

   // public static File boynames()
    
    


