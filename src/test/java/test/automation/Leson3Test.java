package test.automation;

import test.automation.transforms.ArrayTransformSort;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;


public class Leson3Test {

    int[] inputArray = {1,2,3,4,5,-3,2,5,7,9,0,2,3,4,1,-10,12,14};
    int[] outputArray = {2,4,2,0,2,4,-10,12,14,1,3,5,-3,5,7,9,3,1};

    ArrayTransformSort at = new ArrayTransformSort();


    @Test
    public void arrayTransformTest()
    {
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(at.transform(inputArray)));
        assertEquals(Arrays.toString(at.transform(inputArray)), Arrays.toString(outputArray));
        //assertTrue(Arrays.equals(inputArray, outputArray));
        // assertEquals(Arrays.toString(inputArray), Arrays.toString(outputArray));
    }
}
