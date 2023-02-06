/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author muham
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Test15s {
    public static void main(String[]args){// check this
        ArrayList<Card> cards2= new ArrayList();
    

    Scanner sc= new Scanner(System.in);
 System.out.println("Please place 5 Cards perLine the cards Rank: Ac, Tw, Th..., Suit: C D H S");
       
       if(sc.hasNextLine()){
           String cardss= sc.nextLine();
           String [] inputs= cardss.split(" ");
          
           for(String xy: inputs){
       String  card=xy; 
       System.out.println(card);
            String rank= card.substring(0,1);
            String suit=card.substring(1,2);
            System.out.printf("it works %s %s %n",rank, suit );
          
            
            Rank x= ( Card.convertRank(rank));
            System.out.println(x);
           Suit y=(Card.convertSuit(suit));
           System.out.println(y);
           cards2.add(Card.convertCard(x,y));
          
} 
         System.out.println(Card.getfifteens(cards2, cardss)); 
       }
       
    }
}
//AcH KiS FiD QuC