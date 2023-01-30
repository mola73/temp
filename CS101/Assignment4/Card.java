/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
public final class Card {
   private Rank cardrank;
   private Suit cardsuit;
   
   private Card(Rank r, Suit s){
       this.cardrank=r;
       this.cardsuit=s;
   }
   private Card( int i){
       if (i>=0 && i<=52){  
           
       }
   }
   public static Card getCard(Rank r, Suit s) { 
       return new Card(r,s); 
     }
public static Card getCard(int i) { return new Card(i) ; }
    
   public Rank getRank(){
   return this.cardrank;
   }
 public Suit getSuit(){
   return this.cardsuit;
}
// 
 
 public String toString(){
     return String.format("%o  %o", this.getRank(),this.getSuit());
 }


}
