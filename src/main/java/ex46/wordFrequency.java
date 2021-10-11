package ex46;

import java.io.File;
import java.util.*;

public class wordFrequency {
    // Function that reads in everything in the file and figures out the frequency of each word using two array lists.
    // The first array list contains all the words, and the second array list contains the amount of each word
    // The idea is that the index for each word and word's count are the same, so I can keep track of both easily
    public static void frequencyArray(ArrayList<String> words, ArrayList<Integer> wordsCount) throws Exception {
        /*  Open file("input.txt")
            Open scanner("input.txt")
            while(file not empty) {
                String[] wordsInLine = scan.nextLine().split(" ");
                for(each word in string array) either add it to our array lists or increment that word's count
            } */

        // Open the file and scanner
        File inputFile = new File(
                "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner scan = new Scanner(inputFile);

        // While loop that goes through the entire input file
        while(scan.hasNextLine()) {
            // Read in a line and split it up into a string array
            String[] wordsInLine = scan.nextLine().split(" ");
            // Check for each word and document its frequency
            for(String word: wordsInLine) {
                // This check value will keep track of whether we've seen this word
                boolean seenWord = false;
                // For loop that checks if this word has been seen before and if we have, then it increments
                for(int i = 0; i < words.size(); i++) {
                    if(word.equals(words.get(i))) {
                        wordsCount.set(i, wordsCount.get(i) + 1);
                        // Save the fact that we've seen this word
                        seenWord = true;
                    }
                }
                // If we haven't seen the word from before then add it to the array of strings
                if(!seenWord) {
                    words.add(word);
                    wordsCount.add(1);
                }
            }
        }
        // Close the scanner
        scan.close();
    }

    // This function finds the largest value in the wordCount array and returns its position
    public static int findBiggestNumber(ArrayList<Integer> wordsCount) {
        /*  int biggestNumber, location;
            for(wordsCount) if(biggestNumber < wordsCount.get(j)) update biggestNumber and location */

        // These variables will be overwritten to keep track of where the word with the largest count is
        // and what the word is
        int biggestNumber = 0;
        int biggestNumberLocation = 0;
        // Find the word with the largest count
        for(int j = 0; j < wordsCount.size(); j++) {
            if(biggestNumber < wordsCount.get(j)) {
                biggestNumber = wordsCount.get(j);
                biggestNumberLocation = j;
            }
        }
        return biggestNumberLocation;
    }

    // Function that prints all the words and the amount of them in decreasing order
    public static void printWordsAndCountInOrder(ArrayList<String> words, ArrayList<Integer> wordsCount) {
        /*  while(words still has words) {
                findBiggestCountWord;
                Print(word and wordCount);
                Remove(word);
            } */

        // While loop to go through the entire wordsList
        while(words.size() > 0) {
            // Find the word with the highest wordCount
            int biggestNumberLocation = findBiggestNumber(wordsCount);
            // Print the word and wordCount (in asterisks)
            System.out.format("%-10s", words.get(biggestNumberLocation) + ": ");
            for(int k = 0; k < wordsCount.get(biggestNumberLocation); k++) System.out.print("*");
            System.out.println();
            // Remove the word from both array lists
            words.remove(biggestNumberLocation);
            wordsCount.remove(biggestNumberLocation);
        }
    }

    public static void main( String[] args ) throws Exception {
        // Create two array list that will contain all the words we've seen and the amount of each word
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> wordsCount = new ArrayList<>();
        // Update the two lists
        frequencyArray(words, wordsCount);
        // Print the lists
        printWordsAndCountInOrder(words, wordsCount);
    }
}
