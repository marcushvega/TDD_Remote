// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CalcStatsTest {


    @Test
    public void test_for_minimum_value() {
        int expected = 1;
        int[] input = new int[] {1};
        assertEquals(expected, CalcStats.min(input));
    }

    @Test
    public void test_for_creation_of_CalcStats_object() {
        int[] input = new int[] {1};
        CalcStats obj = new CalcStats(input);
        assertNotNull(obj);
    }

    @Test
    public void CSObject_minimumValue() {
        int expected = 1;
        int[] input = new int[] {1,2};
        CalcStats obj = new CalcStats(input);
        assertEquals(expected, obj.getMin());
    }

    @Test
    public void CSObject_minimumValue_when_array_has_three_values() {
        CalcStats obj1 = new CalcStats(new int[] {5,4,0});
        assertEquals(0, obj1.getMin());
    }

    @Test
    public void CSObject_maxValue(){
        int expected = 2;
        int[] input = new int[] {1,2};
        CalcStats obj = new CalcStats(input);
        assertEquals(expected, obj.getMax());
    }

    @Test
    public void CSObject_maxValueWithFourValues(){
        int expected = 8;
        int[] input = new int[] {1,5,2,8};
        CalcStats obj = new CalcStats(input);
        assertEquals(expected, obj.getMax());
    }

    @Test
    public void CSObject_countValues(){
        int expected = 1;
        int[] input = new int[] {3};
        CalcStats obj = new CalcStats(input);
        assertEquals(expected, obj.countValues());
    }
}
