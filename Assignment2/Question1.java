/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unbccpscassignment2;

/**
 *
 * @author molaniyan
 */
//Name: Muhammad Alfatih Olaniyan
//Course:CPSC 100
//UNBC ID:230148724
public class Question1 {
    public static void main(String[]args){
    int weeknum=1; 
     long infectionnum=18; 
     int weeknumb=1;
     long infectionnumb=18;

long infectionlim=8000000000l;
long infectionlimb=8000000000l;
    do{
    System.out.printf("Week %d infection rate is %d \n", weeknum, infectionnum);
    infectionnum= infectionnum*18;
    weeknum+= 1; //weeknum= weeknum +1
}while(infectionnum<infectionlim);
    
    
    while(infectionnumb<infectionlimb){
        System.out.printf("Week %d infection rate is %d \n", weeknumb, infectionnumb);
    infectionnumb= infectionnumb*18;
    weeknumb+= 1;
    }
    
    /*
    Output:
    Week 1 infection rate is 18 
Week 2 infection rate is 324 
Week 3 infection rate is 5832 
Week 4 infection rate is 104976 
Week 5 infection rate is 1889568 
Week 6 infection rate is 34012224 
Week 7 infection rate is 612220032 
Week 1 infection rate is 18 
Week 2 infection rate is 324 
Week 3 infection rate is 5832 
Week 4 infection rate is 104976 
Week 5 infection rate is 1889568 
Week 6 infection rate is 34012224 
Week 7 infection rate is 612220032 
    */
}
}
