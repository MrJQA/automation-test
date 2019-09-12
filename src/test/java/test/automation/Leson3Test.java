package test.automation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;


public class Leson3Test {

    int[] inputArray = {1,2,3,4,5,-3,2,5,7,9,0,2,3,4,1,-10,12,14};
    int[] outputArray = {2,4,2,0,2,4,-10,12,14,1,3,5,-3,5,7,9,3,1};

    @Test
    public void arrayTransformTest()
    {
        //assertTrue(Arrays.equals(inputArray, outputArray));
        assertEquals(Arrays.toString(inputArray), Arrays.toString(outputArray));
    }
}
