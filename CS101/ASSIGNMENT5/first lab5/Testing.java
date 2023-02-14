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

public class Testing {

    public static void main(String[] args) {
        Card start = Card.getCard(30);
        System.out.print(start);
        ArrayList<Card> theCards = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 4; j++) {
                int x = rand.nextInt(52);
                theCards.add(Card.getCard(x));
            }
            //get pair count of arraylist
            int pairs = 0;
            String result = Card.isFlush(theCards);
            for (Card x : theCards) {
                for (Card y : theCards) {
                    if (x != y) {
                        pairs = pairs + x.pairCount(y);

                    }
                }
            }

            System.out.printf("%s : %d pair(s), %s\n", theCards, pairs / 2, result);
            theCards.clear();
        }
    }
}
