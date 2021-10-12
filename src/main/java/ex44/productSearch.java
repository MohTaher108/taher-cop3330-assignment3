package ex44;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

public class productSearch {
    // This function reads all the json file info into a JSONArray and returns it
    public static JSONArray makejsonArray() throws Exception {
        /*  Create JSONParser
            Create object FileReader that parses through file
            Create JSONArray that will have all the input data read into it */

        // Make a parser and file reader
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("" +
                "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json.txt"));
        // Make the object a JSONObject and read in the info into a JSONArray and reutnr it
        JSONObject jsonObject = (JSONObject) obj;
        return (JSONArray) jsonObject.get("products");
    }

    // This function iterates through the file to find and print the inputted product's data
    // Also, return whether the input was valid
    public static boolean iterateThroughFile(JSONArray subjects, String productName) {
        /*  Make an iterator
            boolean check = false
            while(iterator has next) {
                if(product.equals(json.get("name"))) Print and set check = true
            }
            return check; */

        Iterator iterator = subjects.iterator();
        // This value will keep track of whether the input was valid or not
        boolean check = false;
        // Iterate through entire json file and print product info if user input was valid
        while (iterator.hasNext()) {
            // JSONObject that will be used to look through the json file
            JSONObject json = (JSONObject) iterator.next();
            String name = (String) json.get("name");
            // If our product is found in the json file, print its info
            if (productName.toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Name: " + name);
                System.out.format("Price: %.2f\n", json.get("price"));
                System.out.println("Quantity: " + json.get("quantity"));
                // Save that input was valid
                check = true;
            }
        }
        return check;
    }

    // Function that reads in a JSON file and prints out data on a product the user asks for
    public static void findProductInfo() throws Exception {
        /*  open scanner
            boolean check = true;
            do {
                if(!check) print(error);
                check = false;
                make JSONArray that reads JSON file info
                Read in user input
                print product info if input is valid, otherwise loop with check = false
            } while (!check);
            close scanner */

        // Open the scanner
        Scanner in = new Scanner(System.in);
        // Check variable that will maintain whether the user inputted data was valid
        boolean check = true;
        // Do while that repeats if the user input was invalid
        do {
            // If check was set to 0 and not overwritten, then print error statement
            if(!check) System.out.println("Sorry, that product was not found in our inventory");
            // Overwrite check to 0 to be overwritten if user inputted data was valid
            check = false;
            // Read in json file info
            JSONArray JArray = makejsonArray();
            // Read in user input
            System.out.print("What is the product name? ");
            String productName = in.nextLine();
            // Print product info, and return whether input was valid
            check = iterateThroughFile(JArray, productName);
        } while(!check);
        // close the scanner
        in.close();
    }

    public static void main(String[] args) throws Exception {
        findProductInfo();
    }
}
