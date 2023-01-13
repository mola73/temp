/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class NumToStringTest {

    public static void main(String[] args) {//Have two arrays and run through both of them to see if they are the same.
        String[] convertnum = {(NumToString3.numbToString(1)), (NumToString3.numbToString(10)), (NumToString3.numbToString(15)), (NumToString3.numbToString(99)), (NumToString3.numbToString(999)), (NumToString3.numbToString(999999)), (NumToString3.numbToString(10001)), (NumToString3.numbToString(12345678)), (NumToString3.numbToString(999999999)), (NumToString3.numbToString(100))};
        String[] wordform = {"one ", "ten ", "fifteen ", "ninety-nine ", "ninehundredninety-nine ", "ninehundredninety-ninethousandninehundredninety-nine ", "tenthousandone ", "twelvemillionthreehundredforty-fivethousandsixhundredseventy-eight ", "ninehundredninety-ninemillionninehundredninety-ninethousandninehundredninety-nine ", "onehundred "};

        for (int i = 0; i < convertnum.length; i++) {

            int ans = wordform[i].compareTo(convertnum[i]);
            if (ans == 0) {
                System.out.println(ans);
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

}
