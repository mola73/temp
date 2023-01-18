/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
/**
This file is part of a solution to
CPSC 101 Lab 2 Winter 2023
 * Implements a murder program
 * @author Muhammad Alfatih Olaniyan
 * Student Number: 230148724
* @version 1
*/
public class PersonTester {
     public static void main(String[]args){
        Person a= new Person("Abdullah ibn Masood",true);  
            Person b= new Person("Khabbab ib al-arat",true);  
              Person c= new Person("Bilal ibn abi rabah",true);  
      Person d= new Person("Abu jahl",true);  
        Person e= new Person("Umm Anmar",true);  
          Person f= new Person("Uqbah ib abi Mu'ayt",true);  
          Person g= new Person("Random",true);  
          g.die();
          f.die();
          d.murder(b);
          b.murder(g);
          
          
     }
}

