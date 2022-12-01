/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
DO NOT FORGET TO RESET OUT FILE TO BE A DIRECTORY TAKEN BY THE USER!!!!!!!!!!!!!!!!!!!!!!!!!
IMPLEMENT METHODS IN THE QUESTION WHERE IT IS APLLICABEL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Just print the percentage of all the boy/gril names out of all the 2000 names
also print the count of of all the boy/girl names
*/
//Name: Muhammad Alfatih Olaniyan
//Class: CPSC 100
//UNBC ID:230148724
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author molaniyan
 */
public class Question1bns {
      public static void main(String[]args)throws IOException{
        ArrayList <String> gName= new ArrayList <>();//Initializing  boy and girl name arraylists
    ArrayList <String> bName= new ArrayList <>();
     ArrayList <String> gNamecount= new ArrayList <>();//Initializing  boy and girl name frequecy arraylists
    ArrayList <String> bNamecount= new ArrayList <>();
     ArrayList <String> gNameperc= new ArrayList <>();//Initializing  boy and girl name percentage arraylists
    ArrayList <String> bNameperc= new ArrayList <>();
     ArrayList <String> rank= new ArrayList <>();
 
         File Namein = new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\babynames.txt");
        
//        File Nameout = new File("bgnames.txt");
        File Nameout = new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\bgnames.txt");
        
        
        if(Namein.exists()){
            System.out.println(" Namein exists");
        }else{
            System.out.println("The Name in file is not recognized");
        System.exit(0);
    }// Check if the in file exist
        
        if(Nameout.exists()){
            System.out.println(" Nameout exists");
        }else{
            System.out.println("The Name out file is not recognized");
        System.exit(0);
    }
        //Make sure the out files exist.
   
        
       Scanner scan= new Scanner(Namein); // tool  to take in values
       PrintWriter ofile= new PrintWriter(Nameout);// tool to print out values
       //Initailizing printer to print in the user given file
      
       while(scan.hasNext()){
           String[] line= scan.nextLine().split("  ");
           rank.add(line[0]);
           bName.add(line[1]);
           gName.add(line[4]);
           bNamecount.add(line[2]);
           bNameperc.add(line[3]);
           gNamecount.add(line[5]);
           gNameperc.add(line[6]);
           //Put each collumn of the array in an Arraylist
           
       }
       
       for(int i=0; i<gName.size();i++){// run through the girl name arraylist
           
           int countsum=Integer.valueOf(gNamecount.get(i))+Integer.valueOf(bNamecount.get(i));
           //getting the two frequencies of a name in both the boy and girl names and adding them
           double percentaverage=(Double.valueOf(gNameperc.get(i))+Double.valueOf(gNameperc.get(i)))/2; 
           //getting the average of the two percentages and assigning it to a value
           
           if(bName.contains(gName.get(i))){// test if a certain girl name is in the boy name arryalist
               System.out.printf("%7s  %7s  %7s   %7s %n",rank.get(i),gName.get(i),countsum,percentaverage);//printing the girl/boy  name, combined frequency and average percentage  in the command line
               ofile.printf("%7s  %7s  %7s   %7s %n",rank.get(i),gName.get(i),countsum,percentaverage);// printing the girl/boy  name, combined frequency and average percentage  in the outfile
           }
       
    }   
       scan.close();// close the scanner
       ofile.close();//close the printer
}
}
