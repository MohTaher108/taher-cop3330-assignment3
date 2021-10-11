package ex45;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class wordFinder {
    // This function finds all instances of the word "Utilize" and replaces them with "use",
    // and prints everything to a new output file
    public static void replaceAllUtilizeAndPrintToOutput(String outputFileName) throws Exception {
        /*  File inputFile = "input.txt" and scan it
            PrintStream outputFile = "userInputtedString" and System.setOut(outputFile)
            while(file still has words)
            If(word contains "utilize") replace it with "use"
            print(word) */

        // Open the input file and scanner
        File inputFile = new File(
                "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner scan = new Scanner(inputFile);

        // Create the output file and make System.out.print print to it
        PrintStream outputFile = new PrintStream((
                "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex45\\" + outputFileName));
        System.setOut(outputFile);

        // Read through entire file and recreate it with all instances of "utilize" replaced with "use"
        while(scan.hasNextLine()) {
            // Read in all the words in the line into a string array and use a for loop go through it one word at a time
            String[] wordsInLine = (scan.nextLine().split(" "));
            for(String word: wordsInLine) {
                // If string contains "utilize" it gets replaced with "use"
                word = word.replace("utilize", "use");
                // Print that string to new output file
                System.out.print(word + " ");
            }
            // New line for next line in file
            System.out.println();
        }

        scan.close();
    }

    public static void main( String[] args ) throws Exception {
        // Open and close a scanner to read in what the user would like to input for their file name
        Scanner in = new Scanner(System.in);
        System.out.print("What would you like to call your output file: ");
        String outputFileName = in.nextLine();
        in.close();

        // Call the function that reprints the input file but all instances of "utilize" are replaced with "use"
        replaceAllUtilizeAndPrintToOutput(outputFileName);
    }
}
