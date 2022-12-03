/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
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
public class Question1b {

    public static void main(String[] args) throws IOException {

        ArrayList<String> gName = new ArrayList<>();//Initializing  boy and girl name arraylists
        ArrayList<String> bName = new ArrayList<>();

        double count = 0;

        File Namein = new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\babynames.txt");

        File Nameout = new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\bgnames.txt");
//Initializing files
        if (Namein.exists()) {
            System.out.println(" Namein exists");
        } else {
            System.out.println("The Name in file is not recognized");
            System.exit(0);
        }// Check if the in file exist

        if (Nameout.exists()) {
            System.out.println(" Nameout exists");
        } else {
            System.out.println("The Name out file is not recognized");
            System.exit(0);
        }
        //Making sure the out files exist.

        Scanner scan = new Scanner(Namein); // tool  to take in values
        PrintWriter ofile = new PrintWriter(Nameout);// tool to print out values
        //Initailizing printer to print into the user given file

        while (scan.hasNext()) {
            String[] line = scan.nextLine().split("  ");
            bName.add(line[1]);
            gName.add(line[4]);
            //Put each collumn of the array in an Arraylist

        }

        for (int i = 0; i < gName.size(); i++) {// run through the girl name arraylist

            if (bName.contains(gName.get(i))) {   // test if a certain girl name is in the boyname arryalist
                System.out.printf("%7s %n", gName.get(i));//printing the girl/boy  name
                ofile.printf("%7s %n", gName.get(i));// printing the girl/boy  name
                count += 1; //counting how many names are in both the gnames and bnames.
            }
        }
        double percentage = (count / 2000.0) * 100;

        System.out.println("The number of names is " + count);
        System.out.println("The percentage is " + percentage + "%");
        ofile.println("The number of names is " + count);
        ofile.println("The percentage is " + percentage + "%");

        scan.close();// close the scanner
        ofile.close();//close the printer
    }
}
