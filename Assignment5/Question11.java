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
//Name: Muhammad Alfatih Olaniyan
//Class: CPSC 100
//UNBC ID:230148724
import java.util.Scanner;
import java.io.*;
public class Question11 {
    public static void main(String[]args)throws IOException{
        String inpath= "C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\babynames.txt";
        String outpath1= "C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\boynames.txt" ;
        String outpath2="C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\girlnames.txt" ;
      
        File Namein= new File(inpath);
        
        File Nameout = new File(outpath1);
        File Nameout2= new File(outpath2);//Initializing the files
        
       
        if(Namein.exists()){//&& Nameout.exists()&& Nameout2.exists()
            System.out.println(" Namein  and Nameout exist");
        }else{
            System.out.println("One of the files is not recognized");
        System.exit(0);
    }
        //Make sure the in and out files exist.
   
        
       Scanner scan= new Scanner(Namein); // initializing tool to take in values from Namein path
       PrintWriter ofile= new PrintWriter(Nameout);// initializing tool to print out values
       PrintWriter oofile= new PrintWriter(Nameout2);
       
       while(scan.hasNext()){
           String[] line= scan.nextLine().split("  ");// putting the file into an array
          ofile.println(line[0]+"  "+ line[1]+" "+ line[2]+" "+ line[3]); //placing the boy information in the boy file
          oofile.println(line[0]+" "+ line[4]+" "+ line[5]+" "+line[6]); //placing the girl information in the girl file
               
           }

       scan.close();// close the scanner
       ofile.close();//close the printer
           
       }
       
    }

   // public static File boynames()
    
    


