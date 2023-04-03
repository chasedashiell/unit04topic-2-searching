import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSearchTest {
    @Test
    public void testUnorderedSearch() {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "the";
        expectedOutput = 2;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test 
    public void testOrderedLinearSearch(){
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        inputItems = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        inputTerm = "z";
        expectedOutput = -1;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
    }

    @Test 
    public void testOrderedBinarySearch(){
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        inputItems = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        inputTerm = "z";
        expectedOutput = -1;
        actualOutput = StringListSearch.orderedBinarySearch(inputItems, inputTerm);
    }
}
