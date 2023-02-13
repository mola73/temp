package firstlab5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
public enum Suit {
    Clubs, Diamonds, Hearts, Spades; 
    
     public String toShortString(){
        String y= null;
         switch(this.ordinal()){
         case 0:
             y="C";
             break;
             case 1:
             y="D";
             break;
             case 2:
             y="H";
             break;
             case 3:
             y="S";
             break;
                
     }
             return y;
    }
    
}
