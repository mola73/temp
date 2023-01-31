/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

/**
 *
 * @author muham
 */
import java.util.ArrayList;

public class Version1cTest {

    public static void main(String[] args) {

        TimeInterface ti = new Version1c.Time(12, 30, 0);
        TimeInterface tii = new Version2c.Time(1230);
        System.out.println(ti.gethours());
        ArrayList Times = new ArrayList<TimeInterface>();
        Times.add(ti);
        Times.add(tii);
        System.out.println(Times);

        System.out.println(ti.getseconds());

    }
}

/*

Version 1 error without "Implements TimeInterface"
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - incompatible types: Version1.Time cannot be converted to Tests.TimeInterface
	at Tests.Version1cTest.main(Version1cTest.java:1)

Version1c succes
Output:
12

Can you create a TimeInterface array that contains a mixture of version1c.Time and
version2c.Time objects?
Answer: YES
TimeInterface ti = new Version1c.Time(12,30,0);
TimeInterface tii = new Version2c.Time(1230);
ArrayList Times= new ArrayList<TimeInterface>();
    
Times.add(ti);
    Times.add(tii);
    System.out.println(Times);
OUTPUT:
[12 : 30 : 0, 0 : 20 : 30]

3.
TimeInterface ti = new Version1c.Time(12,30,0);
System.out.println(ti.getseconds()) ;

OUTPUT:
0
4.


Output:
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - cannot find symbol
  symbol:   method advanceBy(int)
  location: variable ti of type Tests.TimeInterface
	at Tests.Version1cTest.main(Version1cTest.java:1)

5. 
Output:

12 : 30 : 0
I expected the time because the the Time objects have an overrided toString method. 

*/
