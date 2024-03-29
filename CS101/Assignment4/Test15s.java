/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 * Muhammad Alfatih Olaniyan
 * UNBC ID: 230148724
 *This class counts combinations of fifteen between any 2 cards
 * @author muham
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Test15s {

    public static void main(String[] args) {// check this
        ArrayList<Card> cards2 = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please place 5 Cards perLine the cards Rank: A, 2, 3...Q,K Suit: C D H S");
        while (sc.hasNext()) {
            cards2.clear();
            if (sc.hasNextLine()) {
                String cardss = sc.nextLine();
                String[] inputs = cardss.split(" ");

                for (String xy : inputs) {
                    String card = xy;

                    String rank = card.substring(0, 1);
                    String suit = card.substring(1, 2);

                    Rank x = (Card.convertRank(rank));

                    Suit y = (Card.convertSuit(suit));

                    cards2.add(Card.convertCard(x, y));

                }
                System.out.println(Card.getfifteens(cards2, cardss));
            }
        }

    }
}
