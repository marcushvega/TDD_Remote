// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = FizzBuzz.answer();
        assertEquals(expected, actual);
    }
}

