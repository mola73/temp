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
public enum Rank {
    Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, King, Queen, Jack;
    
    public int count() { 
         return Math.min(ordinal()+1,10);
     }
    public String toShortString(){
        String y= null;
         switch(this.ordinal()){
         case 0:
             y="A";
             break;
             case 1:
             y="2";
             break;
             case 2:
             y="3";
             break;
             case 3:
             y="4";
             break;
             case 4:
             y="5";
             break;
             case 5:
             y="6";
             break;
             case 6:
             y="7";
             break;
             case 7:
             y="8";
             break;
             case 8:
             y="9";
             break;
             case 9:
             y="T";
             break;
             case 10:
                 y="K";
                 break;
             case 11:
             y="Q";
             break;
             case 12:
             y="J";
             break;      
     }
             return y;
    }
    
   
     
}