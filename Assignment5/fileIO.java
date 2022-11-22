/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment5;

import java.io.File;
import java.io.PrintWriter;


/**
 *
 * @author muham
 */
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class fileIO {
    public static void main(String[]args)throws IOException{
        String inpath= "C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\babyNames.txt";
      
        File Namein= new File(inpath);
        
        File Nameout = new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\boynames.txt");
        File Nameout2= new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\girlnames.txt");
        
        if(Nameout.exists()&& Namein.exists()){
            System.out.println(" Namein  and Nameout exist");
        }else{
            System.out.println("One of the files is not recognized");
        System.exit(0);
    }
        //Make sure the in and out files exist.
    ArrayList <String> Name= new ArrayList <>();
    ArrayList<String> Rank= new ArrayList <>();
    ArrayList<String> Perentage= new ArrayList<>();
    ArrayList<String> Frequency = new ArrayList<>();     
    ArrayList<String> GPerentage= new ArrayList<>();
    ArrayList<String> GFrequency = new ArrayList<>();   
    ArrayList <String> GName= new ArrayList <>();
        
        
       Scanner scan= new Scanner(Namein); // tool  to take in values
       PrintWriter ofile= new PrintWriter(Nameout);// tool to print out values
       PrintWriter oofile= new PrintWriter(Nameout2);
       
       while(scan.hasNext()){
           String[] line= scan.nextLine().split("  ");
          ofile.println(line[0]+"  "+ line[1]+" "+ line[2]+" "+ line[3]);
          oofile.println(line[0]+" "+ line[4]+" "+ line[5]+" "+line[6]);
       //   Problem:ALL THE VALUES ARE IN INDEX 0 OD THE ARRAY
              //    GOAL: I WANT TO PUT EACH TERM IN 1 INDEX OF THE ARRAY, SO I CAN EASILY PLACE EACH VALUE IN THE RRAYLIST

             
                             
          
          
               
           }

       scan.close();// close the scanner
       ofile.close();//close the printer
           
       }
       
    }

   // public static File boynames()
    
    


