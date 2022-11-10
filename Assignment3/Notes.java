/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
public class Notes {
   /*
    Objectives:
    1. How static methods and feilds are associated with classes rather than objects
    2. How methd- call return mech. is supp. by the method-call stack
    3. argumwetn promotion and casting
    
    October 30th:
    Methods are used to divide and conquer largwetasks
    Normally methods are called on objects
    Static methods can be called on a  CLASS rather than an object.
    Java API: appliic. program interface: place for reusable libraries
    Methods should be small enought to do one task and have a specific name
    hiding of implem. details promotes go software engineering
    Some methods return a value sjowing that another method reutrned the right value. if the value is worng, del witht the code withtht efirst return value.
    A STATIC method is a method that does not depend not depend on the CONTENTS OF AN OBJECT.
    staic methods are called by (classname.method name(parameters).
    Method arguments acan be constants ,variables or expressions
    Clas math is implicitly imported by the compiler,NO NEED TO IMPORT THIS.  it is in the java.lang package
    
    Exampels;
    Math.abs(x) absolut value of x
    Math.ceil(x) smallest number greater than x
    Mathcos(x) Cos x
    math.exp(x) e to the x exponential
    math.floor(x) largest int not greater than x
    Math.log(x)log ofx ex: log(Math.E)= 1.00
    Math.max(x,y) mAX OF TWO NUMBERS
    Math.min(x,y)
    Math.pow(x,y) x to the power of y
    Math.sin(x)
    Math.sqrt(x)
    Math.tan(x)
    constants: Math. PI: Pi ocnstant
    Math.E: e
    
    A classes variables are sometimes called feilds
    
    Why is Mathod mainDeclared static? :
    When executing the method main the JVM attempts to invoke the method. Whe it is declared as static it allows the JVM to invoke main without CREATING AN OBJECT OF THE CLASS
    Stsuic methods in the smae class can csll each other directly.
    
    IMPORTANT: declaring parameters as(double x, y) is WRONG
    Double x, double y) is CORRECT
    
    When any primitive value whether it s a boolean, int , double..., is CONCATENATED  TO A string, IT CONVERTS IT TO A STRING AND MAKES THE WHOLE STATEMENT A STRING.
    eXAMPLE: "Y +2 =" + Y+2 GIVES THE RESULT OF "Y +2 =52" NOT "Y + 2= 7".
    "Y+2=" + (Y+2) PRODUCES "Y+2 = 7"
    
    RETURN MATH.MAX(X, MATH.MAX(Y,Z)); This is Valid
    
    Novemebr 6:
    Ways of calling a method
    1. 
    Using a method name to a another method in the same class.
    2.
    Usin a clas name followed by a dot and the method name with its arguments
    class.method(x,y)
    3.(for objects/non static method)
    object variable name.method(x,y)
    to call a non static method of the object
    
    YOU CANNOT DECLARE A METHOD OUTSIDE A CLASS OR
    A METHOD WITHIN A METHOD. (sYNTAX ERROR)
    
    YOU CANNOT DECLAR A LOCAL VARIABLE WITH TH SAME NAME AS METHOD PARAMETR
    EX:
    public static int method name(int x){
    int x;
    }
    
    Forgetting to return a value is a complication error!!!!
    
    ALSO RETURNING A VALUE FROM A METHOD WHOSE RETURN TYPE IS VOID IS A COMPLICATION ERROR
    
    Stack data structure:
    LIFO: Last in is first out, like a stack of dishes
    
    Method call stack:
    also known as program execution stack
    supports creation, maintenance, and destruction of each called methods local variables.
    
    
    Stack frames:
    Each method eventually must return something
    each time a method calls a method an entry is pushed on the method call stack
    tHE ENTRY IS CALLED A STACK FRAME OR ACTIVATION RECORD WHICH CONTAINS THE RETURN ADDRESS THAT THE CALLED METHOD NEEDS TO RETURN THE VALUE AFTER IT IS DONE EXECUTING.
    WHEN THE METHOD RETURNS IT TRANSFERS CONTROL TO THE RETURN ADDRESS  IN THE STACK FRAME.
    
    
    SCINCE THE COMPUTER MEMORY IS FINITE IF THEIR ARE TOO MANY MEHTODS ON THE METHOD CALL STACK TO HAVE THERI ACTIVATION RECORDS STORED AN ERROR CALLED STACK OVERFLOW OCCURS
    
    yOU CAN PROMOTE A VARIABLE TYPE TO ANYING HIGHER IN MEMORY
    LIKE FLOAT 32 BIT CAN BE PROMOTED TO DOUBLE 64 BITS
    nOTE: CHAR CAN BE PROMOTED TO INT BUT INT CANNOT BE PROMOTED TO CHAR
    BOOLEAN CANNOT BE PROMOTED TO ANYTHING BECAUSE IT IS NOT A NUMBER
    
    JAVA API: APPLIC. PROGRAMMING PACKAGES OR JAVA CLASS LIBRARY
    
    JAVA.AWT.EVENT: ENABELE EVENT HANDLNG FOR GUI COMP.
    JAVA AWT.GEOM: 2D GRAPHUCS CAPABILITIES
    JAVA.IO: TO INPUT AND OUTPUT DATA
 jAVA .LANG: CONTAIN IMP. CLASSES FOR JAVE, IMPLICITLY IMPORTED
    JAVA.NET: ENABLE COMMUNICATION VIA COMPUTER NETWORKS LIKE THE INTERNET
    JAVA.SECURITY: ENHANCING APPLICATION SECURITY
    JAVA.SQ: WORKING WITH DATABASES
    JAVA.UTIL: STORING AND PROCESSING LARGE AMOUNTS OF DATA
    JAVA.UTIL.CONCURRENT: FOR IMPLEMENTING PROGRAMS THAT CAN PERFORM MULTIPLE TASKS IN PARRALEL.
    JAVAX.SWING:JAVA'S SWING hui COMPONENTS
    JAVAX.SWING.EVENT: EVENT HANDLING
    JAVAX.XML.WS: WORKING WITH WEB SERVICES
    JAVAFX PACKAGES: GRAPHIC AND MULTIMEDIA TCH. FOR THE FUTURE
   
JAVA.TIME: DATES AND TIMES
JAVA.UTIL.FUNTION AND JAVA.UTIL.STREAM: WORKIGN WITH JAVASE *'S FUNCTIONAL PROGRAMMING CAPABILITIES.
    
    ELEMENT OF CHANCE:
    CLASS:SecureRandom in package java.security
    produce random boolean, byte, float, double, int , long, Gaussian values
    produce nondeterministic random numbers
    
    Shfting value: number that chnages the range of randomness
    ex: int number= 1 + randomNumbers.nextint(6);
    This prints arandom number between 1 and 6 not including both of them.
    question: doe sthe limit of the random number include that number?
    */ 
}
