package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class wordFrequencyTest {
    @Test
    void findBiggestNumber() {
        wordFrequency test = new wordFrequency();
        // Create an array of values to use to test our function
        ArrayList<Integer> test_array = new ArrayList<>();
        test_array.add(5);
        test_array.add(3);
        test_array.add(7);
        test_array.add(2);
        test_array.add(8);
        test_array.add(2);
        test_array.add(8);
        // Check if the function finds the correct earliest instance of the smallest number
        assertEquals(4, test.findBiggestNumber(test_array));
    }
}