/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author molaniyan
 */
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
            String rank= card.substring(0,2);
            String suit=card.substring(2,3);
            System.out.printf("it works %s %s %n",rank, suit );
          
            
            Rank x= ( Card.convertRank(rank));//This has a problem
            System.out.println(x);
           Suit y=(Card.convertSuit(suit));
           System.out.println(y);
           cards2.add(Card.convertCard(x,y));
}         
       }
    }
}
    