// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import static org.junit.Assert.assertEquals;


import org.junit.Test;
//import org.junit.jupiter.api.Test;


public class ArrayShuffleTest
{
    @Test
    public void CreateArray(){
        int[] intArr = new int[] {1,2};
        int[] intArrTest = ArrayShuffle.createArray(1,3);
        assertEquals(true, ArrayShuffle.equalArrays(intArr, intArrTest));
    }

    @Test
    public void Create3ValueArray(){
        int[] intArr = new int[] {1,2,3};
        int[] intArrTest = ArrayShuffle.createArray(1,4);
        assertEquals(true, ArrayShuffle.equalArrays(intArr, intArrTest));
    }
}
