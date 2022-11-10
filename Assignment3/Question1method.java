/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unbccpscassignment3;

/**
 *
 * @author muham
 */
public class Question1method {
    public static int investment(int investment){
        int i=0;
        int j= 0;
        for( ; i<5; i++){
            for( ; j< 12; j++){
                if(i/2==0)
                {investment += (investment/10);
                        }else if(investment/2== 1){
                            investment -= (investment/10);
                                    }
                        }
           System.out.println(investment);
        }
        return investment;
        }
    public static void main (String[] args){
        System.out.println(Question1method.investment(10_000));
    }
    }

