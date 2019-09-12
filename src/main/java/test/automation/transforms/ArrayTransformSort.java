package test.automation.transforms;

import java.util.Arrays;

public class ArrayTransformSort {

    public int[] transform (int[] arrayToSort)
    {
        if (arrayToSort.length > 1) {
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = 1; i < arrayToSort.length; i++) {
                    if (((arrayToSort[i - 1] % 2) != 0) && ((arrayToSort[i] % 2) == 0)) {
                        flag = true;
                        int swap = arrayToSort[i - 1];
                        arrayToSort[i - 1] = arrayToSort[i];
                        arrayToSort[i] = swap;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arrayToSort));
        return arrayToSort;
    }

}
