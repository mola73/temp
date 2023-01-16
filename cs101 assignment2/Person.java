/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2cs101;

/**
 *
 * @author muham
 */
/**
This file is part of a solution to
CPSC 101 Lab 2 Winter 2023
 * Implements a murder program
 * @author Muhammad Alfatih Olaniyan
 * Student Number: 230148724
* @version 1

*/
import java.util.ArrayList;
public class Person {
//    public static int numberLiving();
//public static int numberDead();

    private String name;
    private boolean alive;
    private String killer;// to know who killed whom
    private static ArrayList <Person> thePeople= new ArrayList();
    
     public Person(){
    this.name=null;
    this.killer=null;
    this.alive=true;
    thePeople.add(this);
}
     public Person(String name,boolean alive){
    this.name=name;
    this.killer=null;
    this.alive=true;
    thePeople.add(this);
     }
    public Person(String name,boolean alive, String killer){//construcotr
        this.name=name;
        this.killer=null;
        this.alive=alive;
        thePeople.add(this);
        
    }
   @Override
    public String toString(){
     
            return name;   
    }
    public ArrayList<Person> getthePeople(){//keep for testing, when you submit delete
        return thePeople;
    }
  
    public String getkiller(){
       return killer ;
    }
    
    public boolean isAlive(Person n){ //return state fo person
        return n.alive;       
        }
    public String name(Person n){//return name of person
        if(!n.alive){
            return String.format("DECEASED %s", n.name);
        }else return n.name;
    }
    public void die(Person n){//take life of  perosn
        n.alive= false;
    }
    public void kill(Person victim){
        die(victim);
        victim.killer=this.name;
        
    }
    public void sayHello(Person n){
        if(isAlive(n)==true){
        System.out.printf("Hello, I'm %s.%n",n.name);
        }
    }
    public static int numberLiving(){
        int counter=0;
        for (Person x:thePeople){
            if(x.alive==true){
                counter++;      
            }
        }
        return counter;
    }
     public static int numberDead(){
        int counter=0;
        for (Person x:thePeople){
            if(x.alive==false){
                counter++;      
            }
        }
        return counter;
    }
     public static void allSayHello(){//all alive people say hello
         for (Person x:thePeople){
            if(x.alive==true){
                System.out.printf("Hello, I'm %s%n",x.name);     
            }
     }
     }
}
