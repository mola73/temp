/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
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
          System.out.println(thePeople);
    }
}

