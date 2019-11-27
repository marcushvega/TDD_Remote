import org.junit.Test;

import static org.junit.Assert.*;

public class CombinedNumberTest
{
    @Test
    public void createCombinedNumberObject() {
        int[] input = new int[] {4};
        CombinedNumber cn = new CombinedNumber(input);
        assertNotNull(cn);
    }

    @Test
    public void combinedNumberOneDigit(){
        int[] input = new int[] {4};
        CombinedNumber cn = new CombinedNumber(input);
        assertEquals(4, cn.getCombinedNumber());
    }

    @Test
    public void combinedNumberTwoDigits() {
        int[] input = new int[] {4,3};
        CombinedNumber cn = new CombinedNumber(input);
        assertEquals(43, cn.getCombinedNumber());
    }
}
