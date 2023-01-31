/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Version2.Time;
import java.util.Arrays;

/**
 *
 * @author muham
 */
public class Sortv2 {

    public static void main(String[] args) {

        Time a = new Time();
        Time b = new Time(1000);
        Time[] array = {a, b};
        Arrays.sort(array);
    }
}
/*


Version2b error:
Exception in thread "main" java.lang.ClassCastException: Version2.Time cannot be cast to java.lang.Comparable
	at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.util.Arrays.sort(Arrays.java:1246)
	at Tests.Sortv2.main(Sortv2.java:19)

*/
