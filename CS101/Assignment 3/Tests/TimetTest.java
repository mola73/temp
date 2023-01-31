/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

/**
 *
 * @author muham
 */
/**
This file is part of a solution to
CPSC 101 Lab 3 Winter 2023
 * Implements a Time object
 * @author Muhammad Alfatih Olaniyan
 * Student Number: 230148724
 * */
import Version1.Time;

public class TimetTest {

    public static void main(String[] args) {
        Time a = new Time(0, 0, 0);
        Time b = new Time();
        b.sethours(1);
        a.advanceBy(7261);
        System.out.println(a);
        System.out.printf("the minutes of b is%d", b.getminutes());
    }
}
