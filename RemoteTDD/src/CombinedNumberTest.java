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
    public void combinedNumberOneDidget(){
        int[] input = new int[] {4};
        CombinedNumber cn = new CombinedNumber(input);
        assertEquals(4, CombinedNumber.getCombinedNumber());
    }
}
