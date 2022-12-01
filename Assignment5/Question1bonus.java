/*
Ask user for a name
disregard caps or not
If the name is equal to one of the names in boy, print its information (Use .equals because the names are strings) 
if the name is equal to one of the names in girl, print its info,
if it is in both print all the info.

Use .index for searching
If the index exists for the name print the rest of the info, else print that it is not
 */
//Name: Muhammad Alfatih Olaniyan
//Class: CPSC 100
//UNBC ID:230148724
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author muham
 */
public class Question1bonus {

    public static void main(String[] args) throws IOException {
        Scanner Read = new Scanner(System.in);
        System.out.println("Please give a name");
        String Name = Read.nextLine();
        //ArrayLists that I will palce each collumn of the file in each one
        ArrayList<String> gName = new ArrayList<>();//Initializing  boy and gril name arraylists
        ArrayList<String> bName = new ArrayList<>();
        ArrayList<String> gNamecount = new ArrayList<>();//Initializing  boy and gril name frequecy arraylists
        ArrayList<String> bNamecount = new ArrayList<>();
        ArrayList<String> gNameperc = new ArrayList<>();//Initializing  boy and gril name percentage arraylists
        ArrayList<String> bNameperc = new ArrayList<>();
        ArrayList<String> rank = new ArrayList<>();

        //File Namein= new File("babynames.txt");
        File Namein = new File("C:\\Users\\muham\\OneDrive\\Desktop\\UNBC CS1\\Assignment5\\src\\main\\java\\babynames.txt");
        System.out.println(Namein.getAbsoluteFile());
        Scanner scan = new Scanner(Namein); // Tool to take in values from the babynames file

        while (scan.hasNext()) {
            String[] line = scan.nextLine().split("  ");//Put the fie in an array a split each value that has 2 spaces
            rank.add(line[0]);
            bName.add(line[1]);
            gName.add(line[4]);
            bNamecount.add(line[2]);
            bNameperc.add(line[3]);
            gNamecount.add(line[5]);
            gNameperc.add(line[6]);
            //Looping through the array and palcing each value in an arrayalist
        }

        int index = bName.indexOf(Name);
        int index2 = gName.indexOf(Name);
// assigning a variable to the index of the give name form the command line.

        if (0 <= index && 0 <= index2) {// if both of the names are not returned to -1 by the .indexOf method then it prints the info

            int countsum = Integer.valueOf(gNamecount.get(index)) + Integer.valueOf(bNamecount.get(index2));
            //getting the two frequencies of a name in both the boy and girl names and adding them

            double percentaverage = (Double.valueOf(gNameperc.get(index)) + Double.valueOf(gNameperc.get(index2))) / 2;
            //getting the average of the two percentages(The percentage of the name in the boy arryalist) and (The percentage of the name in the boy arryalist)and assigning it to a variable

            System.out.printf("Boy Rank:%5s,  Girl Rank:%5s,  %7s  %7s   %7.3s %n", rank.get(index), rank.get(index2), gName.get(index2), countsum, percentaverage);
        } else //If the Name is a boy or girl name then it will print the combned info. (Since there are 2 different ranks for the boy and girl names, I picked the boy index.
        if (0 <= index) { //if only the name is found in the boy Arraylist, I used the .indexOf() method to find the index of the given number, the method will return -1 if it is false so if its found, the index will be 0 or greater

            System.out.printf("BoyRank:%5s  %7s  %7s   %7.3s %n", rank.get(index), bName.get(index), bNamecount.get(index), bNameperc.get(index));
        } else //test if the given name is in the index of the boy name arraylist, if it is it will print the rest of the information.
        if (0 <= index2) {//if only the name is found in the girlNmaeArraylist, I used the .indexOf() method to find the index of the given number, the method will return -1 if it is false so if its found, the index will be 0 or greater

            System.out.printf("GirlRank:%5s  %7s  %7s   %7.3s %n", rank.get(index2), gName.get(index2), gNamecount.get(index2), gNameperc.get(index2));
        } else {
            System.out.println("That name is not in the list");// If the name is not in the boy or girl arraylist it will print this.
        }
    }

}
