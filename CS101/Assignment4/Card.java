/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author muham
 */
import java.util.ArrayList;
public final class Card {
    ArrayList Cards= new ArrayList();
    private Rank cardrank;
   private Suit cardsuit;
   
   private Card(Rank r, Suit s){ //Constructors
       this.cardrank=r;
       this.cardsuit=s;
   }
   private Card( int i){
       if (i>=0 && i<=52){  
           
       }
   }
 public static Card getCard(Rank r, Suit s) { // public static mhtods for Constructors
       return new Card(r,s); 
     }
public static Card getCard(int i) { 
    return new Card(i);
}
    
   public Rank getRank(){
   return this.cardrank;
   }
 public Suit getSuit(){
   return this.cardsuit;
}
// public int getCribCount(<Card>Cards){
//     
//     
//     
// }
 public static Rank convertRank(String x){// convert a string to rank type
         lab4.Rank y=null;
             switch(x){
         case "Ac":
             y=Rank.Ace;
             break;
             case "Tw":
             y=Rank.Two;
             break;
             case "Th":
             y=Rank.Three;
             break;
             case "Fo":
             y=Rank.Four;
             break;
             case "Fi":
             y=Rank.Five;
             break;
             case "Si":
             y=Rank.Six;
             break;
             case "Se":
             y=Rank.Seven;
             break;
             case "Ei":
             y=Rank.Eight;
             break;
             case "Ni":
             y=Rank.Nine;
             break;
             case "Ki":
             y=Rank.King;
             break;
             case "Qu":
             y=Rank.Queen;
             break;
             case "Ja":
             y=Rank.Jack;
             break;      
     }
             return y;
 }
 
 public static Suit convertSuit(String x){//convert a Stirng to a suit type
     lab4.Suit y=null;
             switch(x){
         case "C":
             y=Suit.Clubs;
             break;
             case "H":
             y=Suit.Hearts;
             break;
             case "D":
             y=Suit.Diamonds;
             break;
             case "S":
             y=Suit.Spades;
             break;
            
     }
             return y;
 }
 
 public static Card convertCard(Rank r, Suit s){
  
     
     return getCard(r,s);
          
 }
 
// 
 @Override
 public String toString(){// How do i print a rank and suit type. %...  %...
     return String.format("", args)
 }

}
