package ex41;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class nameSortingTest {

    @Test
    void sortNamesList() {
        nameSorting test = new nameSorting();

        // Create an unsorted arrayList of strings and make the function sort it
        ArrayList<String> testNamesList = new ArrayList<>();
        testNamesList.add("Swift, Geoffrey");
        testNamesList.add("Jones, Chris");
        testNamesList.add("Jones, Aaron");
        test.sortNamesList(testNamesList);

        // Create a manually sorted version of the arrayList
        ArrayList<String> sortedTestNamesList = new ArrayList<>();
        sortedTestNamesList.add("Jones, Aaron");
        sortedTestNamesList.add("Jones, Chris");
        sortedTestNamesList.add("Swift, Geoffrey");

        // Check that the function gave the same sorted array list that I manually created
        assertEquals(sortedTestNamesList, testNamesList);
    }
}