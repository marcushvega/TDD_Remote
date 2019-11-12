// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import static org.junit.Assert.assertEquals;

import PACKAGE_NAME.ArrayShuffle;
import org.junit.Test;
//import org.junit.jupiter.api.Test;


public class ArrayShuffleTest
{
    @Test
    public void CreateArray(){
        int[] intArr = new int[] {1,2};
        assertEquals(intArr, ArrayShuffle.createArray());
    }
}
