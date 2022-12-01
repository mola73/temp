/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author muham
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Classwork {
    /*
    VEERRY IMPORRRTAAANT FOR THTHEE FINAAL
    Nov 21
    name.substring(5(startindex))
    name.substring(2,4(Start,endindex)) It ends at one index before the number given
    name.indexOf(char); gives the index of this value, if it is ot found it return -1
    name.clone();
    
    OBJECT ORIENTED PROGRAMMING:
    Object orientation
    
    Constuctors are automatically invoked
    
    if you d not invoke a constructor the complie it will do it for you.
    if you invoke on, the computer will not invoke one.
    Youc an have more than 1 constructor for your class.
    constructors do not have a return type, because they donot send you anyhtin back;
    Ther is no void in the method.
    You can have a class without a structure
    The name of the constry=uctor has to be the same name as the class.
    constructors have access to private methods
    mutattr object or setter methods change the state of the instance
    obserever  or getter methpd: an operation to oserve the state of the instance
    consructor does not crate a new object
    
    3 characteristcs of objects:
    Unique identity
    State: rep of attributes by internall data
    Behavior: a set of allowed operations
    
    base class and inherit to other classes
    behaviour is different in different contexts.
    
    ABT: Account
    top part: instance variables
    bottom part: behaviors
    + is public
    _- is private
    
    
    November 23
    
    UML Diagram:
    || | | | | || | | | | | | | | | |
    | - hours: int
    |  -mins : int
    |  -secs: int
    behaviours
    
    |  + TimeType()
    |  + TimeType(int,int,int)
    |  + SetTime(int, int, int)
    | + getTime(); TimeType; 
    | + display();
    |+ increment();
    | equal(TimeType);: boolean
    |
    |
    |
    
    To code this :
    You need to 2 java files
    
  1.  public class TimeTypeDriver{
    public static void main(String[]args){
    TimeType t1 = new TimeType(); //Initialize object
    TimeType t2=newTimeType(12,15,25);// initialize object without constructor, constructor is aoutomatically done by the compiler
  
    2 public class TimeType{
    private int hours; // variables declared
    private int minutes;
    private int seconds;
    
    //declare constructors
    public TimeType(no arguments)
    {
    hours=minutes=seconds=0
    }
    
    public TimeType(int h, int m, int s){
    hours=h; or this.hours=h
    mins=m;  or this.mins=m
    secs=s; or this.secs=s
    
    }
    public TimeType getTime(){
    TimeType s= new TimeType(h,m,s);
    }
    
    public void display(){
    s.out.printf("%2d : %2d: %2d", hours,mins,secs);
    }
    public void increment(){
    secs++
    if(secs>59){
    mins++
    if (mins>59){
    hours++
    mins=0;
    if (hours>12){
    hours==0;
    }
    mins=0;
    }
    secs=0;
    }
    }
    public boolean equal(TimeType t){
    //comparing two different times
    //recieving a time object 
    if (t.hrs== hrs && t.mins==mins&& t.sec==secs){
    return true
    }else false
    }
    
    OR 
    return(t.hrs== hrs && t.mins==mins&& t.sec==secs)
    }
    
    Novemebr 25 Tutorial:
    constructor: building blocks of an object. Necessary parts thatamake an object, like wheels and gears for a bicycle
    geters and setters: methods to access private instance variables.
    : methods : actions that can be done by the object. a human moving the left or right foot.
    
    November 28:
    When you write a To sting mehtod it overides the compilers ot string method
    
    November 30:
    names arryalist: [Waqar, Haque, xyz, 2, 4.5, 2, 4.5];
    names.remove(2); removes object at index 2 off arraylist;
    names.remove("2"); nothing happens because htere is no string of 2, only an Integer.
    names.remove(Integer.valueOf(2)); removes the first 2 in the array list
    names.remove(4.5); it removes 4.5 from the arryalist because there is no anmbiguity
    
    names.removeAll(4.5); THIS IS AN ERROR because it has to be a collection like an array or arraylist;
    like(
    Arraylist temp= new ArrayList();
    temp.add(4.5);
    names.remove(temp); now it it will remove the 4.5 , if you add more numbers in the aralist it will also remove those.
    )
    
    Collections.sort(names); sorts the arryalist according to ASCII TABLE (ascending order)
    names.indexOf(...);  where is the the value in the brackets.
    for example name.indexof(2); this gives 3, becaus that is its index form left to right.
    names.lastIndexOf(...); this returns index of the value from right to left ore end to beginning;
    
    ///TRY CS TESTS ONLINE FOR PRACTCE FOR THE FINAL
    //Study ch 1-8, 14,15
    // tf , fill in th eblanks 50pt, code segments 45pts, multiple choice 54 points;
    
    Their
    */
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
       Arraylist <Integer> numbs= new <Integer>(); 
       System.out.println("please give a number");
       int x= sc.nextInt();
       int count=0;
       if(numbs.contain(x)){
        for(int i= 0; i<numbs.size(); i++){
            if(x== numbs.get(i)){
                count+=1;
        }
        System.out.println(count);
       
    }else{
    System.out.println("It is not in the list");
}
}
    }
}
