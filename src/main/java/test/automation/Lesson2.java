package test.automation;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesson2 {



    public static void main(String[] args)
    {
        int[] myArray = {1,2,3,4,5,3,2,5,7,9,0,2,3,4,1};
        int sumArray = 0;
        //Task 1 Option 1
        sumArray = Arrays.stream(myArray).sum();
        System.out.println(sumArray);

        //Task 1 Option 2
        sumArray = 0;
        for(int i = 0; i < myArray.length; i++)
        {
            sumArray += myArray[i];
        }
        System.out.println(sumArray);

        //Task 1 Option 3
        sumArray = 0;
        for(int i:myArray)
        {
            sumArray += i;
        }
        System.out.println(sumArray);

        //Task 2 Option 1
        boolean flag = true;
        while (flag)
        {
            flag = false;
            for(int i = 1; i < myArray.length; i++)
            {
                if ( ((myArray[i-1] % 2) != 0)  && ((myArray[i] % 2) == 0))
                {
                    flag = true;
                    int swap = myArray[i-1];
                    myArray[i-1] = myArray[i];
                    myArray[i] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));

        //Task 2 Option 2
        //System.out.println(Arrays.toString(
        //IntStream.of(myArray).boxed().sorted((l, r) -> l % 2 - r % 2).toArray()
        //));
    }

}
