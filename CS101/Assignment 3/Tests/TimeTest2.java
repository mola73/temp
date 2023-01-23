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
import Version2.Time;
public class TimeTest2 {
    public static void main(String[]args){
        Time a=new Time();
        Time b=new Time(3600);
               System.out.println(a.equals(b));
    }
}
