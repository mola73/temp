/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

/**
 *
 * @author muham
 */
import Version1.Time;
public class TimetTest {
    
    public static void main (String[]args){
    Time a=new Time(12,12,12);
    Time b=new Time();
    b.advanceBy(3601);
    
    System.out.println( b);
    }
}
