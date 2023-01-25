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
    Time a=new Time(0,0,0);
    Time b=new Time();
    a.advanceBy(-7261);
    
    System.out.println( a);
    }
}
