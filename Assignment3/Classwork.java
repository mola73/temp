/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
public class Classwork {
    /*
    Octobe 24 2022
    Methods:
    Math.pow(x,y); = x to the power of y
    
   Benefits of methods:
    Modularity
    Information hiding
    Condensability(avoids repetition
    Transperancy(maintenance) Chage of method does not afect effectivenss
    
    method call:
    
    public(access specifier:publci, private, protected) static void(return type) main(Method name)(..Parameter...){
    
    
    }
    Methods: 
    placed outside main method.
    
    
    EX:
    public static double mypower(double x, double y){
    double ans= 1;
    for(inti=1;i<y; i++){
    ans= ans*x;
    return ans;
    }
    
    Inside main method:
    double d1= 4.0, d2= 5.0;
    double answer;
    
    answer = ,my power(d1,d2);
    }
    
    
    October 26:
    
    
    Octobe 28:
      // factorial method
    public static int facotrial(int num){
    
    int result =1;
    for (int i =1; i<=num; i++){
    result*=1;
    }
    return result;
    }
    //power method
    public static int power (int base, int exp){
    int result=1;
    for(int i=0;i<exp; i++){
    result*=base
    }
    return result;
    }
    // distance method
    public static double distance(int a, int b){
    return Math.sqrt(a,2) + Math.sqrt(b,2);
    }
    
    public static String convert(int a, int b){
    String result;
    switch (a){
    case 1
    result ="sunday"
    break;
    case 2:
    result= Monday;
    break;
    case 3:
    result= "Tuesday"
    case4:
    result = "Friday"
    break;
    default:
    result = "saturday"
    return result;
    
    
    // Method overloading:
    Youc cannhve methods witht the same name but different parameters.
    Method signature: The name and paramaters
    
    Ex:
    public static int dothing (int x){}
    
    public static String dothing(int x, String y){}
    
    // These two are different because the parameters are different.
    Return type is not part f the siganture, so it does not differntiate methods)
    
    (Double y, String x) is different form (String x, Double y) // order matters
    
    
    Try paratice with add and subtract methods******
    
    
    //Scope
    
    Scope of loops:
    variables initialized  in loops  do not exist out side of it.
    Varaibles declared out side of a loop and initialized in a loop, still exists outside the loop.
    
    Scope of methods:
    Variables declared in a method do not affect or interfere with othe r methods wiht  the same variable.
    In a method, change in primitives do not affect anthing.
    Reference point changes affect the method. ex. printing arrays
    
    
    //Tic tac toe
    public class TicTacToe{
    
    case 1 -> a1 = 'x' ;
    
    |   |
    |   |
    |   |
    
    a1, a2, a3, b1, b2, b3, c1,c2,c3
    
    print table and instructiions
    
    then do swith statement for each choice
    the put in loop to reapeat again
    }
    
    
    
    }
    */
    
  //  October 29 Textbook chapter 5 review
                //1.
//        
//        int i= 0;
//        for( ;i<5; i++){
//            System .out.println("x");
//            THIS WORKSSSSSSSS
//            
//        }

//2.
//int i= 0;
//for( ; ; i++){
//    System.out.println("x");
//}
//IT WOORKSS BUT IT IS AN INFINITE LOOP


//3.
//int i= 0;
//for( ;i<5 ; ){
//    System.out.println("x");
//    i++;
//}
////THIS WORKS IT PRINTS X 5 TIMES
//4.
//double x= 123456789.12345;
//int y= 12345;
//System.out.printf(" %f and %d", x,y);
//// a comaa(,) in the format specifier(%,1f) gives commas ever 3 numbers like 123, 456,789
////a dot (.) says the number next to it is its precision

//5. 
       // The(^) variable is the exclusive Or boolean term.
//       If used, ony one of the boolean stataemnts can be true for the expression to be true
//               If both are true or false, then the whole expression is false.
    
    /*
    
    October 31
   1.  public static int time(int hour, int minute, int second){
    if (hour<= 12){
    hour = hour-12;
    }
    hour= hour*3600;
    minute=minute*60;
    
    int total = hour + minute + second;
      return total;
    
    Teachers code:
    public static int seconds(int h; int m ; int s){
    return 3600 *(h>=12? h-12;h)+ 60 *m +s    
    }
    
   2.  To get the difference of two second methods
    public static void main (String []args){
   int x= class.seconds( int h1, int m1, int s1)
   int y= class.second(int h2, int m2, int s2)
    System.out.println(x-y);
    
    }
    
    3. monitor temp
    If 3 temps are over 200 sound the alarm
    
    public static boolean Chemiclasecurity(int temp){
    boolean warning= false;
    boolean safety= true;
    for(i =0; i < 3; i++{
    
    if( temp >200){
    int counter= counter +1;
    int temp = meausrment.nextInt();
    }       
    if (temp <= 200){
    counter=0;
    }
    if {counter >= 3){
   return warning ;
    }
    else
    temp= measurment.nextInt();
  METHOD OVERLOADING Using different methods witht the same names
    name and type of arguments are part of the signature of amethod. Like int, double, ...
    
    
    Arrays on wednesday.
    Randomness concepts like rolling dice flipping coin.
    
    November 2:
    import java.util.Random; import statement
    Random rnd = new Random();
    int toss;
    toss = rnd.nexInt(2); the limit is 2 so it will bring a number less than two which is 0 or 1. (proven)
    .nextDouble(); can be used
    .nextInt(); can be used
    
    import java.security.SecureRandom; import very secure randomness package( Has slower perfomrance time.)
    
    ARRAYS:
    Contiguous:
    array= |_|_|_|_|_|_|_|_|_|_.....
    Grid:  0 1 2 3 4 5 6 7 8 9
    
    int[]grade= new int[20](size aka index= 0-19);
    OR
    int n= 40(aka size);
    int[] grade= new int [n];
    int y[]= {4,9,6,3,2}; correct the size is 5 but the index is form 0 to 4;
    
    update:
    int[5]grade= 22;
    []grade={1,4,5,3,5,73,62,46,74,5,63};
    for(inti=0; i<n; i++){
    [i] grade= i*2;
    This prints|0|2|4|6|8|10.....
    }
    printing:
    for(int i=0; i<n;i++){
    s.o.p(arr[i]);
    }
    WARNING: S.o.p([]grade); does not print the array, it prints the address(reference point);
    
    array index cannot be negative.
    
     A MAIN METHOD TAKES AN ARRAYOF STRINGS AS AN ARGUMENT;!!!!
    
    use arr.length for loop limits, it gives you the SIZE of the specific array.
    
    
    
   COULD BE ON FINAL EXAM:
    a[5] =b[9]; this is fine;
    
    a=b; assigns the address of a to b; (right to left assigning) 
    so both a and b are addresses that both point to the arra of b;
    The computer does it right to left but the logic is left to right;
    
    YOU CANNOT UPDATE THE SIZE OF AN ARRAY ONCE YOU INITIALIZATION;
    EXPRESIONS CAN BE USED IN INITIALZIATIONS LIKE:
    double Y[]={4.0,d(initialized before),6.0,3.0,Math.pow(x,y)(initialized before),class.method(int x,int y),}; THIS IS VALID;
    
    
    Enhanced for loops
    
    
    ARRAYLISTS:(They need to be imported  import java.util..
    Arraylists does not need to be assigned a size in the beginning.(Dynamically sized)
    do not use array for findning then amount of factors in a number.
    You can get rid of numbers in the array 
    You can add or remove from anywhere
    
    Disadvantages:
    THEY ARE A LITTLE BIT SLOWER THAN ARRAY'S
    
    CREATION:
    ArrayList<Integer> name= new ArrayList<>();
    
    What is <>:
    You put the data type;
    Generics creating methods for every different data types.
    All the primitive types have reference wrappers:
    int: Integer
    double: Double
    char:Character
    
    USE THEM:
    name.add(i); adds i at the end of the arraylist
    name.add(index, element);
    name.get(x); to print an element in the arraylist ( arryalist uses array.size not .length);
    name.indexOf(x); to print the index of an arraylist;
    name.remove(x); to remove  value x;
    name.remove(Integer.valueOf(5));
    name.size(x); give size of array.THIS IS A  METHOD BECAUSE OF THE PARANTHESES because the size can be changed unlike arrays.
    
    Novemebr 9th:
    arr[0].get(0); this is getting a an array list in the array, and looking for the number in  index 0 of the arraylist.
    name.get(0[0]); vise versa
    
    String(characterArray,1, 5), To turn the index 1 through 5 of a char array into a string.
    name.charAt(index); print sthe the character in a string at index x
    name.getChar(beg index, end index, after x amount of chars then put this) ; get chars and put them together
    
    name.compareTo(string);  compareto strings
    name.regionalmatches(x); compare regional length;
    name.indexOf(); index of char
    name.lastindexOf(); finds index of characterbackwards
    subString(start): return string from start
     subString(start.end): return string from end
    
    string builders:
    String Builder buuilder= new Stringbuilder
    
    string.split(); it splits the array wherever the parameter is and puts it ina string.
*/
    }

