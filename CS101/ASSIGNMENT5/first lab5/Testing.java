/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlab5;

/**
 *
 * @author molaniyan
 */
//THIS CODE IS NOT COMPILING
import java.util.ArrayList;
import java.util.Random;
import firstlab5.Card;
public class Testing {
    public static void main(String[]args){
        Card start= firstlab5.Card.getCard(Rank.Ace, Suit.Clubs);
        ArrayList<Card> theCards =new ArrayList();
        Random rand= new Random();
        for(int i=0;i<40;i++){
            for(int j=0;j<4;j++){
                int x= rand.nextInt(52);
                theCards.add(start.getCard(x));
            }
            System.out.println(theCards);
            theCards.clear();
        }
    }
}
