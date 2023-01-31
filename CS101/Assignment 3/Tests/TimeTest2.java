/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

/**
 * This file is testing the version 2 Time class and trying the sorting
 *
 * @author muham
 */
/**
This file is part of a solution to
CPSC 101 Lab 3 Winter 2023
 * Implements a Time object
 * @author Muhammad Alfatih Olaniyan
 * Student Number: 230148724
 */
import Version2.Time;

public class TimeTest2 {
    
    public static void main(String[] args) {
        Time a = new Time(3600);
        Time b = new Time(3600);
        System.out.println(a.equals(b));
        System.out.println(a);
        b.advanceBy(60);
        System.out.printf("the minutes of b is %d", b.getminutes());
    }
}
