// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
//import org.junit.jupiter.api.Test;


public class ArrayShuffleTest
{
    @Test
    public void createArray(){
        int[] intArr = new int[] {1,2};
        int[] intArrTest = ArrayShuffle.createArray(1,3);
        assertEquals(true, ArrayShuffle.equalArrays(intArr, intArrTest));
    }

    @Test
    public void create3ValueArray(){
        int[] intArr = new int[] {1,2,3};
        int[] intArrTest = ArrayShuffle.createArray(1,4);
        assertEquals(true, ArrayShuffle.equalArrays(intArr, intArrTest));
    }

    @Test
    public void create4ValueArray() {
        int[] intArr = new int[] {1,2,3,4};
        int[] intArrTest = ArrayShuffle.createArray(1,5);
        assertEquals(true, ArrayShuffle.equalArrays(intArr, intArrTest));
    }

    @Test
    public void createValueBetweenMinAndMax() {
        assertTrue(ArrayShuffle.checkValue(1,5,3));
    }

    @Test
    public void checkValueBetweenMinAndMaxFalse() {
        assertEquals(false,ArrayShuffle.checkValue(1,4,18));
    }

    @Test
    public void enterRandomValuesIntoArray() {
        assertEquals(true, ArrayShuffle.randomNumbers(1,5));
    }
}
