/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

/**
 *This file is testing the version 2 Time class and trying the sorting
 * @author muham
 */
import Version2.Time;
public class TimeTest2 {
    public static void main(String[]args){
        Time a=new Time();
        Time b=new Time(3600);
               System.out.println(a.equals(b));
    }
}
