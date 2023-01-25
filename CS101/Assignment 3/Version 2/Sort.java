/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version1;

/**
 *
 * @author molaniyan
 */
import Version1.Time;

import java.util.Arrays;
public class Sort {
    public static void main(String[]args){
        Time a=new Time();
        Time b= new Time(1,2,3);
        Time[] array  = {a,b};
       Arrays.sort(array);
    } 
}
