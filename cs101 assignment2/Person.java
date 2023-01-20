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
private String name;
    private boolean alive;
    private String killer;// to know who killed whom
    private static ArrayList <Person> thePeople= new ArrayList();
    
     public Person(String name){
    this.name=name;
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
    public ArrayList<Person> getthePeople(){//keep for testing, when you submit delete
        return thePeople;
    }
  
    public String murderer(){//delete this before submitting
       return this.killer ;
    }
    
        public String name(){//return name of person
        if(!this.alive){
            return String.format("DECEASED %s", this.name);
        }else return this.name;
    }
        
    public boolean isAlive(){ //return state fo person
        return this.alive;       
        }
    
    public void die(){//take life of  perosn
        if(this.alive==true){
        this.alive= false;
        }
    }
    
    public void murder(Person victim){
        if(this.alive && victim.alive){
        victim.die();
        victim.killer=this.name;
    }else if(!this.alive){ 
        System.out.printf("The murderer: %s is not alive%n", this.name);
    }else if(!victim.alive){
        System.out.printf("%s is already dead%n",victim.name);
    }
    }
    
    public void sayHello(){
        if(this.isAlive()==true){
        System.out.printf("Hello, I'm %s.%n",this.name);
        }
    }
    public static int numberLiving(){
        int counter=0;
        for (Person x:thePeople){
            if(x.isAlive()==true){
                counter=counter +1;      
            }
           
        }
        return counter;
    }
     public static int numberDead(){
        int counter=0;
        for (Person x:thePeople){
            if(x.isAlive()==false){
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
   @Override
    public String toString(){
     
            return name;   
    }

}
