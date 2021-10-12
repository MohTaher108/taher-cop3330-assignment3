package ex44;

import java.io.File;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class productSearch {
    public static void main( String[] args ) throws Exception {
        Scanner in = new Scanner(System.in);

        /*

        System.out.print("What is the product name? ");
        String productName = in.nextLine();

        // JsonElement jelement = JsonParser.parseReader(new FileReader(
        //         "C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json.txt"));
        // JsonObject inputFile = jelement.getAsJsonObject();

        File inputFile = new File("C:\\Users\\Hamod\\IdeaProjects\\taher-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_output.json.txt");
        Gson gson = new Gson();
        Map<String, Map<String, Integer>> inputData = gson.fromJson(inputFile, HashMap<String, Map<String, Integer>>);

        // If product name invalid, redo (use while loop and function for condition)

         */

        in.close();
    }
}

/*
jsonArray[]
created from your fromJson
jsonArray alone will be a pointer to the top of the array
jsonArray[0] the first item
0,1,2,3 length of the array
.name attribute
put into a String first
because if the String is empty then you know something is wrong

@Muhammad If you want to print your array, try Arrays.toString(<array_name>). Remember to import java.util.Arrays at the top of your file.
 */
