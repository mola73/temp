/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author muham
 */
public class Notes {
    //Room 1/5/23
    /*
    Abstract classes and method: When you want to creat an object that is too brad which makes it impossibe to be instantiated or made concrete, but it cna be inherited form to make more specific objects.
    For example: Class shapes(Super)- Class 3d shapes(sub) and Class 2d shapes(sub)  These are abstract
    but under 2d shapes you can inhrit traingles, squaress...
    under 3d shapes you can inherit cubes , pyramids...
    
     For example, you can write a method with a parameter
of an abstract superclass type. When called, such a method can
receive an object of any concrete class that directly or
indirectly extends the superclass specified as the parameter’s
type.
    
    public abstract void draw(); // abstract method

    A class that
contains any abstract methods must be explicitly declared
abstract even if that class contains some concrete
(nonabstract) methods
    
    Constructors and
static methods cannot be declared abstract.
Constructors are not inherited, so an abstract constructor
could never be implemented.
    Though non-private(public or protected)
static( does not make object of method) methods are inherited, they cannot be overridden.
Since abstract methods are meant to be overridden so that
they can process objects based on their types, it would not
make sense to declare a static method as abstract.

    Classes must be declared abstract if they declare
abstract methods or if they inherit abstract methods
and do not provide concrete implementations of them;
otherwise, compilation errors occur.

    Clasrroom:
    What makes good code:
    update code
    readability
    
    Makes everything upercase whenit is a final: public static final thing.
    
    Length of name should correlate size of code.
    Bigger the scope, bigger the name.
    
    Use singular names
    
    ALL MEMBER VARIALES MUST BE PRIVATE;
    
    The compiler does not check comments
    be careful where the comments are.
    have comment on method to show what it does
    
    Mehtods help prevent DRY (Dont Repeat Yourself)
    
    1/9/23:Wednesday
    READ THE TEXTBOOK!!!!!!!!!!!!!!!!!
    1. Input/output devices: nose eys ears: Monitor, keyboard, mouse, speakers...
    
    2. Brain: cpu: central processing unit,ALU:, register: fast form of storage;
    
    3. Memory: RAM:Random access memory, Permanent storage: Once something is in a file it is in permanent storage. 
    cache : very fast memory in betwen permanent storag and CPU. The intermediary between both of them.
    
   4.  Buses: Information paths that flow between different rgions of the computer like CPU to RAM to Monitor...
    64 bits of data that can be used to comunicate data.
    32 bits
    2 to the 10 is 1032 or aprox. a 1000
    2 to the 20 is 1 million
    2 to the 30 is aprox.1 billion....
    
    4a.KIND OF BUSES:
    addres bus: tells the bus where that info is present in the RAM. this info is at address (3212dnkq2) possibly
    data bus has the info like a long variable of numbe23 23 (64 bits)
    control bus tel bus to ship or store indfo
    
    
    OS VIEW OF MEMORY:
    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    1.pragram memory
    
    
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
Pargram 2 memory:



\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 
    Program19 memory:................ many possible
    
    
    
   ///////////////////////////////////////////////
    memory mapped file
    
    
    ////////////////////////////////////////////
    
    
    threads share memrory
    programs do not share memory
    
    
    
    
    
    
    
    */
    private static final String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] bigs = {"hundred", "thousand", "million"};
    
     public static void main(String[]args) {// THIS WORKS BUT STIL CHECK FIRST (The program is not printing the hundreds, fix that and apply to folowing programs
      
String words="";
        int n= 9234567/1000000;
        for (int counter = 0; counter <3; counter++) {
            switch (counter) {
                case 0:
                    if (n != 0 && n % 10 != 0) {
                        words = ones[(n % 10) - 1];
                        System.out.println(words);
                        System.out.println(n);

                    }
                    break;
                case 1:
                    if (((n % 100) / 10) == 1 && (n != 0) && ((n%100)/10) !=0) { //if it is in between11 and 19
                        words = teens[(n % 10)];
                        n = n / 100;
                        System.out.println();
                        System.out.println(words);
                        System.out.println(n);
                    }

                    if (((n % 100) / 10) > 1) {//if it is above 19
                        words = tens[((n % 100) / 10) - 2] + " "+ words;

                        n = n / 100;
                        System.out.println();
                        System.out.println(words);
                        System.out.println(n);
                    }
                   if((n%10==0)&&(n%100==0)){ //if it is 100,200, 300.....
                    n=n/100; //if the number is not a teen or somesort of ten then remove the first two digits( for the digits 1 and 100)
                    System.out.println();
                    System.out.println(words);
                    System.out.println(n);
                } 
                    break;

                case 2:
                    if (n != 0 && (n%1000)!=0) { //for hundreds
                        words = ones[((n % 10)- 1)] + " " + bigs[0] +" "+ words;
                        n = n / 10;
                        System.out.println();
                        System.out.println(words);
                        System.out.println(n);
                    }
                      
                   
                    break;
            }
        }
        
        words= words + " "+ bigs[2];
       System.out.println(words);
        
        
        
    
}
}