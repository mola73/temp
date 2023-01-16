/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2cs101;

/**
 *
 * @author muham
 */
public class PersonTester {
    public static void main(String[]args){
          Person a= new Person("Abdullah ibn Masood",true);  
            Person b= new Person("Khabbab ib al-arat",true);  
              Person c= new Person("Bilal ibn abi rabah",true);  
      Person d= new Person("Abu jahl",true);  
        Person e= new Person("Umm Anmar",true);  
          Person f= new Person("Uqbah ib abi Mu'ayt",true);  
          f.kill(c,f);
          e.kill(b,e);
          a.sayHello(a);
          b.sayHello(b);
          c.sayHello(c);
          f.sayHello(f);
          System.out.println(e.getkiller());
    }
}
