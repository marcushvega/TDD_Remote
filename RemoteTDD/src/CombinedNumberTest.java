import org.junit.Test;

import static org.junit.Assert.*;

public class CombinedNumberTest
{
    @Test
    public void createCombinedNumberObject() {
        CombinedNumber cn = new CombinedNumber(new int[4]);
        assertNotNull(cn);
    }
}
