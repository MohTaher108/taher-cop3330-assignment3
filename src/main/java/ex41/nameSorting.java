/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mohammad Taher
 */

package ex41;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class nameSorting {
    // Function that reads in all the input from the file into an arraylist of strings
    public static ArrayList<String> readFileInformation()  throws Exception {
        /*  How to read the file info:
            File inputFile = new File(input.txt);
            Scanner scan = new Scanner();
            ArrayList<String> namesList
            while(scan.HasAnotherLine) namesList.add(scan.line); */

        // Open our input file and a scanner
        File inputFile = new File("C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt");
        Scanner scan = new Scanner(inputFile);

        // Create an array list of strings to hold all the info in the input file
        ArrayList<String> namesList = new ArrayList<>();

        // Read everything in the file into the array list
        while(scan.hasNextLine()) {
            namesList.add(scan.nextLine());
        }
        // Return the array list, which now contains all names
        return namesList;
    }

    // Function that goes through the arraylist and sorts it alphabetically
    public static void sortNamesList(ArrayList<String> namesList) {
        /*  for(i = 0 to namesList.size()) {
                for(j = i to namesList.size()) {
                    if(namesList.get(j).charAt(0) < namesList.get(i).charAt(0)) swap strings at i and j
                    else if they're equal, check the next letters with a loop
                        if any of the next letters of j come before the letters in i then it's sooner so swap
                        else don't swap
                }
            } */

        // temp variable so I can swap strings
        String temp;
        // Nested for loop that compares a word to all words in front of it
        for(int i = 0; i < namesList.size(); i++) {
            // j = i, because sorted words don't need to be rechecked
            for(int j = i; j < namesList.size(); j++) {
                // For loop that compares each letter in both words to see which comes first alphabetically
                for(int k = 0; k < namesList.get(j).length(); k++) {
                    // If the word we're checking's initial comes before the word at the beginning of the list,
                    // then swap them and break the loop
                    if(namesList.get(j).charAt(k) < namesList.get(i).charAt(k)) {
                        temp = namesList.get(i);
                        namesList.set(i, namesList.get(j));
                        namesList.set(j, temp);
                        break;
                    }
                    // Else if the opposite is true, then break the loop and no swapping is needed
                    else if(namesList.get(j).charAt(k) > namesList.get(i).charAt(k)) break;
                    // Notice there isn't an if statement for when they're equal,
                    // and that's when the loop happens to check the next letter
                }
            }
        }
    }

    // This function prints the entire sorted list to an output file
    public static void printNamesList(ArrayList<String> namesList) throws Exception {
        // Create the output file and make System.out.print print to it
        PrintStream output = new PrintStream((
                "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_output.txt"));
        System.setOut(output);

        // Print the entire list
        System.out.println("Total of " + namesList.size() + " names");
        System.out.println("-----------------");
        for(String s: namesList) System.out.println(s);
    }

    public static void main( String[] args )  throws Exception
    {
        // I'll have three functions:
        // one that reads in the file info, one that sorts the names, and one to print them into an output file
        ArrayList<String> namesList = readFileInformation();
        sortNamesList(namesList);
        printNamesList(namesList);
    }
}
