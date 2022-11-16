/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaniyan
 */
//import java.security.SecureRandom;
public class Notes {
   public static void main(String[]args){
//        SecureRandom ran= new SecureRandom();
//        int x= -1+ ran.nextInt(2);
//        System.out.println(x);
//        //the shifting variable shifts the wholerandom limit
    int[][] arr= {{1,5},{2,4},{3,3},{4,2},{5,1}};
//    int[] arr2 = sumOfRows(arr);
//    for(int num: arr2){
//        System.out.printf("%3d", num);
 //  }
//        /*
//        Output:
//        3 9 15
   //     */
   int[] arr3= sumOfColumns(arr);
   for(int num2 : arr3){
       System.out.printf("%3d", num2);
   }
       
    }
    
   public static int[] sumOfRows(int[][] arr){
      int []temp=new int[arr.length];
       for(int i= 0; i<arr.length; i++){
           
           
           
           for(int j=0; j<arr[i].length; j++){
           temp[i]+= arr[i][j];    
       }
           
   }
       return temp;
   }
   
   public static int[] sumOfColumns(int[][] arr){
      int [] temp= new int[arr[0].length];
      
      
       for (int j=0; j<arr[0].length;j++){
           
           
       for(int i=0; i<arr.length; i++){
               
               temp[j]+= arr[i][j];
               
           } 
       }
       return temp;
   }
}
//Jagged arrays