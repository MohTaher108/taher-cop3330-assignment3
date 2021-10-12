/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex42;

import java.io.File;
import java.util.*;

public class parsingData {
    // Function that reads in all the input from the file into an arraylist of string arrays
    public static ArrayList<String[]> readFileInformation()  throws Exception {
        /*  How to read the file info:
            File inputFile = new File(input.txt);
            Scanner scan = new Scanner();
            ArrayList<String[]> namesList
            while(scan.HasAnotherLine) namesList.add(scan.line.split(",", 3)); */

        // Open our input file and a scanner
        File inputFile = new File("C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");
        Scanner scan = new Scanner(inputFile);

        // Create an array list of string arrays to hold all the info in the input file
        ArrayList<String[]> namesList = new ArrayList<>();

        // Read everything in the file into the array list
        while(scan.hasNextLine()) {
            namesList.add(scan.nextLine().split(",", 3));
        }

        // Return the array list, which now contains all the information
        return namesList;
    }

    // This function formats and prints all the information
    public static void printNamesList(ArrayList<String[]> namesList) {
        // Format for table
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");

        // Nested for loop for every person, then every piece of information about that person
        for(String[] temp_array: namesList) {
            for(String temp: temp_array) {
                // Format the print by using a string
                System.out.format("%-10s", temp);
            }
            // New line for the next person
            System.out.println();
        }
    }

    public static void main( String[] args )  throws Exception
    {
        // This function reads in the file info and parses it into an array list of string arrays
        ArrayList<String[]> namesList = readFileInformation();
        // This function formats and prints all the information
        printNamesList(namesList);
    }
}
