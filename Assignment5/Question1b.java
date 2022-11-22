/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author molaniyan
 */
public class Question1b {
      public static void main(String[]args)throws IOException{
        ArrayList <String> gName= new ArrayList <>();
    ArrayList <String> bName= new ArrayList <>();
        Scanner scan1= new Scanner(System.in);
        String inpath= "babynames.txt";
        System.out.println("Please input the output file name");
        String printtofile= scan1.nextLine();
      
        File Namein= new File(inpath);
        
        File Nameout = new File(printtofile);
        
        
        if(Namein.exists()&& Nameout.exists()){
            System.out.println(" Namein  and Nameout exist");
        }else{
            System.out.println("One of the files is not recognized");
        System.exit(0);
    }
        //Make sure the in and out files exist.
   
        
       Scanner scan= new Scanner(Namein); // tool  to take in values
       PrintWriter ofile= new PrintWriter(Nameout);// tool to print out values
       //Initailizing printer to pritn in user given file
       System.out.println("test");
       while(scan.hasNext()){
           String[] line= scan.nextLine().split("  ");
           bName.add(line[1]);
           gName.add(line[4]);
           for(int i=0; i<gName.size();i++)
           if(bName.contains()&& gName.contains()){
               
           }
           
       }
       
       
    }       
}
