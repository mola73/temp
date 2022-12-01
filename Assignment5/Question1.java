/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author muham
 */
import java.util.Scanner;
import java.io.*;
public class Question1 {
    public static void main(String[]args){
     Scanner scan= new Scanner(System.in);
        System.out.println("please provide the directory path for your input file in quotations");
        
        File babynames= new File(scan.next());
        
        System.out.println("please provide the directory path for your output file in quotations");
        File boynames = new File(scan.next());
    }
}
    