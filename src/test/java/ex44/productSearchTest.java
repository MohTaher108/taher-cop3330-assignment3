package ex44;

import org.json.simple.JSONArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class productSearchTest {
    @Test
    void iterateThroughFile() throws Exception {
        productSearch test = new productSearch();
        JSONArray JArray = test.makejsonArray();
        assertEquals(true, test.iterateThroughFile(JArray, "Thing"));
        assertEquals(false, test.iterateThroughFile(JArray, "nothing"));
    }
}