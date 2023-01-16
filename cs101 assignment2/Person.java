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
   
    public static String toString(ArrayList thePeople){
        for(Person x: thePeople){
            return String.format("%s",x.name);
        }
        
    }
    public static ArrayList<Person> getthePeople(){//keep for testing, when you submit delete
        return thePeople;
    }
  
    public String getkiller(){
       return killer ;
    }
    public void listadd(Person x){//add new people to the arraylist of people
        thePeople.add(x);
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
    public void kill(Person killer,Person victim){
        die(victim);
        victim.killer=this.name;//
        
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
