/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
HOW DO I MAKE 20% OF THE SEATS FILLED?
Are arrays better or arraylist?
Make seats rndom, not this
 */
/**
 *
 * @author muham
 */
import java.util.Arrays;
import java.security.SecureRandom;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        SecureRandom Random = new SecureRandom();

        int[][] bus = new int[10][6];
        int x;
        int y;
        int firstcount = 24;
        int econcount = 36;
        int count = 0;
        while (count <= 12) {
            x = Random.nextInt(6);
            y = Random.nextInt(10);
            if (bus[y][x] != 1) {
                bus[y][x] = 1;
                if (y < 4) {
                    firstcount--;
                } else {
                    econcount--;
                }

                count += 1;
            }

        }
        Display(bus);

        Scanner Reader = new Scanner(System.in);
        while (firstcount + econcount > 6) {
            System.out.println("Would you like First class or Economy");
            System.out.println("Please write F for Frist class or E for Economy class");
            String c = Reader.nextLine();
            System.out.println("How many seats would you like? 1, 2, or 3?");
            int num = Reader.nextInt();
            Reader.nextLine();
            if (c.equals("F")) {
                if (num == 3) {
                    boolean allocated = false;
                    int row = 0;
                    while (!allocated && row < 4) {
                        allocated = Allocation3(bus, row);
                        row++;
                    }
                    if (firstcount >= 3 & !allocated) {
                        System.out.println("There are no  3 adjacent seats in First class, so you were assigned seperatley");
                        allocated = Allocationrand(bus, 3, 0, 4);

                    }
                    if (allocated) {
                        firstcount -= 3;
                        
                        System.out.println(firstcount);
                        
                    }
                    else{
                        System.out.println("Could not be allocated");
                    }
                    
                    
                    
                } else if (num == 2) {
                     boolean allocated = false;
                    int row = 0;
                    while (!allocated && row < 4) {
                        allocated = Allocation2(bus, row);
                        row++;
                    }
                    if (firstcount >= 2 & !allocated) {
                        System.out.println("There are no  2 adjacent seats in First class, so you were assigned seperatley");
                        allocated = Allocationrand(bus, 2, 0, 4);

                    }
                    if (allocated) {
                        firstcount -= 2;
                        
                        System.out.println(firstcount);
                        
                    }else{
                        System.out.println("Could not be allocated");
                    }


                } else if (num == 1) {
                    boolean allocated= false;
                     if (firstcount >= 2 & !allocated) {
                        allocated = Allocationrand(bus, 1, 0, 4);

                    }

                }
            } else if (c.equals("E")) {

            } else {
                System.out.println("Please fix the input");
            }
            Display(bus);

        }
    }
    

    public static void Display(int[][] bus) {

        for (int i = 0; i < bus.length; i++) {
//            
            for (int j = 0; j < bus[i].length; j++) {

                if (j == 2) {
                    System.out.print(bus[i][2] + "   ");
                } else {
                    System.out.print(bus[i][j] + " ");
                }

                //This is for the aisle
            }
            System.out.println();
        }
    }

    public static boolean Allocation3(int bus[][], int row) {
        if (bus[row][1] == 0 && bus[row][2] == 0 && bus[row][0] == 0) {
            bus[row][0] = 1;
            bus[row][1] = 1;
            bus[row][2] = 1;
            return true;
        } else if (bus[row][4] == 0 && bus[row][5] == 0 && bus[row][3] == 0) {
            bus[row][3] = 1;
            bus[row][4] = 1;
            bus[row][5] = 1;
            return true;

        }
        return false;
    }
    public static boolean Allocation2(int bus[][], int row){
        if (bus[row][0] == 0 && bus[row][1] == 0 ) {
            bus[row][0] = 1;
            bus[row][1] = 1;
            return true;
        } else if (bus[row][1] == 0 && bus[row][2] == 0) {
            bus[row][1] = 1;
            bus[row][2] = 1;
            return true;
        }else if(bus[row][3] == 0 && bus[row][4] == 0){
            bus[row][3] = 1;
            bus[row][4] = 1;
            return true;
            }else if(bus[row][4] == 0 && bus[row][5] == 0){
            bus[row][4] = 1;
            bus[row][5] = 1;
            return true;
            }
        return false;
    }

    public static boolean Allocationrand(int bus[][], int seats, int rowstart, int rowend) {
        int count = 0;
        for (int i = rowstart; i < rowend; i++) {
//            
            for (int j = 0; j < bus[i].length; j++) {

                if (bus[i][j] == 0) {
                    bus[i][j] = 1;
                    count++;
                }
                if (count == seats) {
                    return true;
                }
            }
        }

        return false;
    }

}
