package ex03_more_arrays;

import ex03_more_arrays.ArrayOfInts;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTest {

    @Test
    void findCommonElements_happyFlow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        Integer[] commonArray = arrayOfInts.findCommonElements(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3, 4});

        Integer[] test = new Integer[] {1, 2 ,3};
        assertArrayEquals(test, commonArray);
    }

    @Test
    void findCommonElements_null_returnsNull() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        Integer[] commonArray = arrayOfInts.findCommonElements(new Integer[]{}, new Integer[]{1, 2, 3, 4});

        assertNull(commonArray);
    }

    @Test
    void findDuplicateElements_happyFlow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        Integer[] duplicateArray = arrayOfInts.findDuplicateValues(new Integer[]{1, 2, 3, 4, 4});

        Integer[] test = new Integer[] {4};
        assertArrayEquals(test, duplicateArray);
    }

}