/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author molaniyan
 */
import Version1.Time;
public class TimeTest {
    
    public static void main (String[]args){
    Time a=new Time(12,12,12);
    Time b=new Time();
    b.advanceBy(12345);
    
    System.out.println( b);
    }
}
