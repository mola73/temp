/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
import java.security.SecureRandom;
public class Notes {
   public static void main(String[]args){
//        SecureRandom ran= new SecureRandom();
//        int x= -1+ ran.nextInt(2);
//        System.out.println(x);
//        //the shifting variable shifts the wholerandom limit
    int[][] arr= {{1,2},{4,5},{7,8}};
    int[] arr2 = sumOfCollumns(arr);
    for(int num: arr2){
        System.out.println(num);
    }
    }
   public static int[] sumOfCollumns(int[][] arr){
      int []temp=new int[arr[0].length];
       for(int i= 0; i<arr.length; i++){
           
           
           
           for(int j=0; j<arr[i].length; j++){
           temp[i]+= arr[j][i];    
       }
           
   }
       return temp;
   }
}
//Jagged arrays