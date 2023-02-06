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
import java.util.Scanner;
public class TestCard {
//    Write a TestCard class that reads in lines of input and writes lines of output until there is
//no more input. Each input line should have one or more card values, separated by single
//spaces. For instance an input line might look like
//5S TC AH JD
//The output should be the same card values in the same format, followed by the total pegging
//count, for instance:
//5S TC AH JD : total count 26
    
    // Answers:
 /*   /*
    System.in cards, 
    then make them into objects
    then do getCrib count on card objects
    then return pegging value
    */
    
//change letters to numbers, numbers can go object rank/suit becasue each enum has a number.
    public static void main(String[]args){
     System.out.println(Rank.Two.count());// This is useful for gettting the object version.
        ArrayList<Card> cards= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please place the cards Rank: Ac, Tw, Th..., Suit: C D H S");
       
       while(sc.hasNext()){
       String  card=sc.next(); 
       System.out.println(card);
            String rank= card.substring(0,2);
            String suit=card.substring(2,3);
            System.out.printf("it works %s %s %n",rank, suit );
          
            
            Rank x= ( Card.convertRank(rank));//This has a problem
            System.out.println(x);
           Suit y=(Card.convertSuit(suit));
           System.out.println(y);
           cards.add(Card.convertCard(x,y));
           System.out.println(cards);

       }
      
       
       
      
    }
    
    

}
