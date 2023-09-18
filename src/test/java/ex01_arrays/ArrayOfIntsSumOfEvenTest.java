package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsSumOfEvenTest {

    @Test
    void sumOfEven_happyFlow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {1, 2, 3, 4});

        assertEquals(6, sumOfEven);
    }
    @Test
    void sumOfEven_null_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(null);

        assertEquals(0, sumOfEven);
    }

    @Test
    void sumOfEven_emptyArray_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {});

        assertEquals(0, sumOfEven);
    }
    @Test
    void sumOfEven_smallArray_returnsSum() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {5, 6});

        assertEquals(6, sumOfEven);
    }

    @Test
    void sumOfEven_allUneven_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {5, 7, 9});

        assertEquals(0, sumOfEven);
    }
}