/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
/*
Name:MUHAMMAD ALFATIH OLANIYAN
CLASS: CPSC101
ID:230148724
ASSIGNMENT 1
 */
public class Countw {

    public static void main(String[] args) {//Main method runs through array of words and calls the count method to give how many  w's in the word.
        String[] wordform = {"one ", "two", "twentytwo", "ten ", "fifteen ", "ninety-nine ", "ninehundredninety-nine ", "ninehundredninety-ninethousandninehundredninety-nine ", "tenthousandone ", "twelvemillionthreehundredforty-fivethousandsixhundredseventy-eight ", "ninehundredninety-ninemillionninehundredninety-ninethousandninehundredninety-nine ", "onehundred "};

        for (int i = 0; i < wordform.length; i++) {

            System.out.println("The amount of w's in the word" + " " + wordform[i] + " " + "is " + count(wordform[i]));
        }

    }

    public static int count(String words) {
        int counter = 0;
        char[] letters = words.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'w') {
                counter = counter + 1;
            }

        }

        return counter;
    }

}
