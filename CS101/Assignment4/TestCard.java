/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 * Muhammad Alfatih Olaniyan 
 * UNBC ID : 230148724 
 * This class gives the sum of certain amount of cards

 *  *
 * @author muham
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TestCard {

    public static void main(String[] args) {

        ArrayList<Card> cards = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please place the cards Rank: A,2,3,4,5,6,7,8,9,T,K,Q,J, Suit: C D H S");
        String cardss = null;
        while (sc.hasNext()) {
            cards.clear();
            if (sc.hasNextLine()) {
                cardss = sc.nextLine();
                String[] inputs = cardss.split(" ");
                for (String xy : inputs) {
                    String card = xy;

                    String rank = card.substring(0, 1);
                    String suit = card.substring(1, 2);

                    Rank x = (Card.convertRank(rank));//This has a problem

                    Suit y = (Card.convertSuit(suit));

                    cards.add(Card.convertCard(x, y));

                }

                System.out.println(cards.get(0).getCribCount(cards, cardss));
            }

        }

    }

}
