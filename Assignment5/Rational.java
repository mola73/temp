/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class Rational {
    private int numerator;
    private int denominator;
    
    public Rational(){
    if(denominator==0){
        denominator=1;
    }
    denominator=numerator=1;
}
    public Rational(int num, int denum){
        numerator= num;
        denominator=denum;
        
        //this.numerator= numerator
        //this.denominator=denominator
        
    }
    public Rational add(Rational f1, Rational f2){
        Rational sum= new Rational();
        sum.denominator= f1.denominator *f2.denominator;
        sum.numerator= ((f1.numerator * f2.denominator)+ (f2.numerator * f1.denominator));// multiply opposite denominator to opposite numerator and add both of them.
    return sum;
    }
    public Rational subtract(Rational f1, Rational f2){
         Rational minus= new Rational();
        minus.denominator= f1.denominator *f2.denominator;
        minus.numerator= ((f1.numerator * f2.denominator)- (f2.numerator * f1.denominator));// multiply opposite denominator to opposite numerator and subtract both of them.
    return minus ;
    }
    public Rational multiply(Rational f1, Rational f2){
        Rational product = new Rational();
        product.denominator= f1.denominator * f2.denominator;
        product.numerator= f1.numerator *f2.numerator;
        
        return product;
    }
    public String toString(){
    
    return Stringformat("%3d/%3d",numerator, denominator);
}
   
    
            
}
//bonus find how to simplify!!!!!!1