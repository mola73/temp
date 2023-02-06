/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author muham
 */
public enum Rank {
     Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, King, Queen, Jack;
     
     public int count() { 
         return Math.min(ordinal()+1,10);
     }
     
     
}
