/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
PRINT THE FIRST COUNT AND EOCN COUNT EVRY TIME YOU FILL THE BUS.
iNPUT COMMENTS
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
                switch (num){
                    case 3: 
                    boolean allocated = false;
                    int row = 0;
                    while (!allocated && row < 3) {
                        allocated = Allocation3(bus, row);
                        row++;
                        // Try and assign the concecutive seats if theya re not assigne dand ar in first clas which is row 0 to 4
                    }
                    if (firstcount >= 3 & !allocated) {
                        System.out.println("There are no  3 adjacent seats in First class, so you were assigned seperatley");
                        allocated = Allocationrand(bus, 3, 0, 3);
                       // if it is not allocated withe 3 consecutive seats, then assign the seats to the first 3 open seats if the amount of available seats in firtc class is more than or equal to 3.
                    }
                    if (allocated) {
                        firstcount -= 3;
                        
                        System.out.println(firstcount);
                        //if it is allocated in one of the above ways and the method returns true then reduce the amount of available first class seats by 3. 
                    }
                    else if ( firstcount==0 && !allocated){
                        System.out.println("Could not be allocated");
                    }
                    break;
                    // balanced
                 case 2:
                     allocated = false;
                     row = 0;
                    while (!allocated && row < 3) {
                        allocated = Allocation2(bus, row);
                        row++;
                    }
                    if (firstcount >= 2 && !allocated) {
                        System.out.println("There are no  2 adjacent seats in First class, so you were assigned seperatley");
                        allocated = Allocationrand(bus, 2, 0, 3);

                    }
                    if (allocated) {
                        firstcount -= 2;
                        
                        System.out.println(firstcount);
                        
                    }else{
                        System.out.println("Could not be allocated");
                    }
                    break;


                 case 1: 
                     allocated= false;
                     if (firstcount >= 1 & !allocated) {
                        allocated = Allocationrand(bus, 1, 0, 3);
                    }
                     if (allocated) {
                        firstcount -= 1;
                        
                        System.out.println(firstcount);
                        
                    }else{
                        System.out.println("Could not be allocated");
                    }
                     break;
                }
            }
            
                
             if (c.equals("E")) {
                
                switch(num){
                    case 3: 
                         boolean allocated = false;
                    int row = 3;
                    while (!allocated && row < 10) {
                        allocated = Allocation3(bus, row);
                        row++;
                        // Try and assign the concecutive seats if theya re not assigne dand ar in first clas which is row 0 to 4
                    }
                    if (firstcount >= 3 & !allocated) {
                        System.out.println("There are no  3 adjacent seats in First class, so you were assigned seperatley");
                        allocated = Allocationrand(bus, 3, 3, 10);
                       // if it is not allocated withe 3 consecutive seats, then assign the seats to the first 3 open seats if the amount of available seats in firtc class is more than or equal to 3.
                    }
                    if (allocated) {
                        econcount -= 3;
                        
                        System.out.println(econcount);
                        //if it is allocated in one of the above ways and the method returns true then reduce the amount of available first class seats by 3. 
                    }
                      break;
                      
                    case 2:
                     allocated = false;
                     row = 3;
                    while (!allocated && row < 10) {
                        allocated = Allocation2(bus, row);
                        row++;
                    }
                    if (firstcount >= 2 & !allocated) {
                        System.out.println("There are no  2 adjacent seats in First class, so you were assigned seperatley");
                        allocated = Allocationrand(bus, 2, 3, 10);// row start is an index, row end is the size which is (1+ the last index)

                    }
                    if (allocated) {
                        firstcount -= 2;
                        
                        System.out.println(firstcount);
                        
                    }else{
                        System.out.println("Could not be allocated");    
                } 
                    break;
                    
                    case 1:
                         allocated= false;
                     if (firstcount >= 1 & !allocated) {
                        allocated = Allocationrand(bus, 1, 3, 10); //row start is the start index for econ, row end is the siz of economy, done like thos for for loop
                    }
                     if (allocated) {
                        firstcount -= 1;
                        
                        System.out.println(firstcount);
                        
                    }else{
                        System.out.println("Could not be allocated");
                    }
                    break;
                        
                }
            }
            
else {
                System.out.println("Please fix the class input");
            }
            
            
            Display(bus);
            

        }
        System.out.println("The bus is 90% full");
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
