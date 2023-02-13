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
import java.util.ArrayList;
public final class Card {
   ArrayList<Card> theCards= new ArrayList();
    private Rank cardrank;
   private Suit cardsuit;
   
   private Card(Rank r, Suit s){ //Constructors
       this.cardrank=r;
       this.cardsuit=s;
   }
   private Card(int i) {//Make an array of all 52 cards and pick 1 with i, then assign it to the attributes being created
 ArrayList<Card> deck = new ArrayList();
 Rank[] r= Rank.values();
 Suit[] s=Suit.values();
        for (Suit x  : s) {
            for (Rank y: r) {
                deck.add(new Card(y, x));
            }  
        }
        if (i >= 0 && i <= 52) {
            this.cardrank = deck.get(i).getRank();
            this.cardsuit = deck.get(i).getSuit();
        }
    }
   
       
 public static Card getCard(Rank r, Suit s) { // public static mhtods for Constructors
       return new Card(r,s); 
     }
 
public Card getCard(int i) {  
return  new Card(i) ;
}
    
   public Rank getRank(){
   return this.cardrank;
   }
 public Suit getSuit(){
   return this.cardsuit;
}
 public int getCribCount(ArrayList<Card>Cards){
     int sum=0;
     for(Card x: Cards){
        sum= sum+ x.cardrank.count();
     }
     
     return sum;
 }
 
 public int getfifteens(ArrayList<Card>cards2){// check this
     int comb=0;
  for(Card x : cards2){
      for (int i=1; i<=cards2.size();i++)
      {
          if((cards2.get(i).getRank().count()) +(x.getRank().count())==15){
             ++comb; 
          }
          
      }
      
 }
  return comb;
 }
 public static Rank convertRank(String x){// convert a string to rank type
         firstlab5.Rank y=null;
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
     firstlab5.Suit y=null;
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
 public char symbol(Suit x){
         
         char symbol=0;
         switch(x){
             case Clubs:
                 symbol= '\u2663';
                 
             case Diamonds:
                 symbol='\u2662';
                   break;
             case Hearts:
                 symbol='\u2661';
                 break;
             case Spades:
                 symbol='\u2660';
                 break;
         }
         return symbol;
 }
// 
 @Override
 public String toString(){// How do i print a rank and suit type. %...  %...
      return String.format("%s of %s", this.getRank(),symbol(this.getSuit()));
 }
     }
     


